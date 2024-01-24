import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {

        Customer cst;

        try{
            cst = Customer.class.getConstructor().newInstance();
            Annotation[] declaredAnnotations = cst.getClass().getDeclaredAnnotations();

            System.out.println(cst.getClass().getAnnotation(Tabela.class).value());

        }catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e){
            System.out.println(e.getMessage());
        }
    }
}