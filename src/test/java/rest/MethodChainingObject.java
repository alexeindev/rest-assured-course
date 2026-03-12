package rest;

//This is an example of how does method chaining works to comprehend more of
//how restAssured works
public class MethodChainingObject {

    public MethodChainingObject methodA(){
        System.out.println("Method A");
        return(this); // Should return the object in order to be used by other methods
    }

    public MethodChainingObject methodB(){
        System.out.println("Method B");
        return(this);
    }

    public MethodChainingObject methodC(){
        System.out.println("Method C");
        return(this);
    }
    public static void main(String[] args) {
        MethodChainingObject object = new MethodChainingObject();
        object.methodA().methodB().methodC();
    }
}
