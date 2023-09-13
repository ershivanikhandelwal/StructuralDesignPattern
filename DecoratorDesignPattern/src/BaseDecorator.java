public abstract class BaseDecorator implements IDataSource{
    protected IDataSource nextLayer;
    public BaseDecorator(IDataSource source){
        this.nextLayer=source;
    }
}
