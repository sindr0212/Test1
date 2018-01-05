import com.chen.pojo.Car;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        System.out.println("陈其龙的测试项目开始");
        Car car =new Car();
        car.setName("兰博基尼A330");
        System.out.println(car.getName());
        System.out.println("测试项目结束");
    }

}
