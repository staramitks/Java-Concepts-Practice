package home.amit.java.basic.strings;

public class StringReplacement {

    public static void main(String[] args) {

        String s="Endpoint=sb://sbus-pva2-bm-soa001.servicebus.windows.net/;SharedAccessKeyName=RootManageSharedAccessKey;SharedAccessKey=vu94i9oGGXBIokMwlaxy/nsHpRjMPVe5HCb+mjtwEwE=";
        String replaced =s.replaceAll("\\\\", "");
        System.out.println(replaced);

    }

}
