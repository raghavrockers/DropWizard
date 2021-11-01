import com.google.inject.AbstractModule;
import com.google.inject.Injector;
import com.google.inject.Guice;

import javax.inject.Inject;
import javax.inject.Named;

interface D1{
    public void meth();
//     {
//         System.out.println("i am working!!");
//     }
}

class D2{
    private D1 var;
    @Inject @Named
    public D2(D1 var){
        this.var=var;
    }

    public void meth1(){
        var.meth();
    }
}
class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(D1.class).to(D1implemt.class);
    }
}
class D1implemt implements D1{
    @Override
    public void meth() {
        System.out.println("asdasddddddd");
    }
}

public class GuiceTest {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Module());
        D2 dea1 = injector.getInstance(D2.class);
        dea1.meth1();

    }
}
