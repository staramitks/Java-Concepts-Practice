package home.amit.designpattern.structural.proxy;

public class ProxyImage implements Image{

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String file)
	{
		fileName=file;
		
	}
	
	@Override
	public void display() {
		if (realImage==null)
		{
			realImage=new RealImage(fileName);
		}
		realImage.display();
	}

}
