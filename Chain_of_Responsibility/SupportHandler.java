package Chain_of_Responsibility;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    public SupportHandler setNext(SupportHandler handler){
        this.nextHandler = handler;
        return handler;
    }
    public abstract void handle(String issue);
}
