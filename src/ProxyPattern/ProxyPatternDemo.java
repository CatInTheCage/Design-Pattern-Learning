package ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_dali.jpg");
        //图像需要执行loadFromDisk方法
        image.display();
        //不需要执行loadFromDisk
        image.display();

    }
}
