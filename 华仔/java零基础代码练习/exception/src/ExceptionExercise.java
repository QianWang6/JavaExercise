/**
 * @author Qian Wang
 * @version 1.0
 */

class OpenException extends Exception{};
class CloseException extends OpenException{};
class NewException extends Exception{};
public class ExceptionExercise {
    public ExceptionExercise() throws OpenException{};
    public void f() throws OpenException{};
    public static void main(String[] args) {

    }
}
class Newclass extends ExceptionExercise{
    //子类构造器必须抛出父类构造器中的异常，因为子类构造器被调用的时候会先调用父类构造器
    public Newclass()throws OpenException,NewException{};

    @Override
    //子类函数重写父类方法时，可以不带父类异常（前提是确保子类已经处理好该异常）
    //也就是说，子类不能声明抛出比父类版本更多的异常
    public void f(){};

    public static void main(String[] args) {
        try {
            ExceptionExercise p = new Newclass();
            p.f();
        } catch (OpenException e) {
            e.printStackTrace();
        } catch (NewException e) {
            e.printStackTrace();
        }
    }

}


