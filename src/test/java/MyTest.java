import com.haiwang.logistics.pojo.Staff;
import com.haiwang.logistics.service.StaffService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 张阿荣
 * @version 1.0
 * @title: MyTest
 * @projectName SSM_MiMI_0605
 * @description:
 * @date 2019/6/20   10:57
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-dao.xml","classpath:applicationContext-service.xml"})
public class MyTest {

    @Autowired
   private StaffService staffService;

    @Test
    public void testGetProductById(){
        Staff staff=staffService.getStaff1("上海市");
        System.out.println(staff);

    }
}
