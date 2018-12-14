import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Meipo implements InvocationHandler {

    private Person target;
    //获取被代理人的个人资料



    public Object getInstance(Person target) throws Exception{
        this.target = target;
        Class clazz = target.getClass();
        new Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces()，)

        return null;

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        return null;
    }
}
