public class EncryptionDecorator extends BaseDecorator{
    public EncryptionDecorator(IDataSource source){
        super(source);
    }
    @Override
    public String read() {
        String s= nextLayer.read();
        return decrypt(s);
    }

    @Override
    public void write(String value) {
        String enc= encrypt(value);
        nextLayer.write(enc);
    }

    public String decrypt(String s){
        return "Decrypt";
    }

    public String encrypt(String s){
        return " Encryption ";
    }
}
