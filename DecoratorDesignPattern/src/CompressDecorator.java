public class CompressDecorator extends BaseDecorator {
    public CompressDecorator(IDataSource source){
        super(source);
    }
    @Override
    public String read() {
        String s = nextLayer.read();
        String s1=decompress(s);
        System.out.println(s1);
        return s1;
    }

    @Override
    public void write(String value) {
        String s= Compress(value);
        nextLayer.write(s);
    }

    public String Compress(String s){
        return "Compress";
    }

    public String decompress(String s){
        return "Decompress";
    }
}
