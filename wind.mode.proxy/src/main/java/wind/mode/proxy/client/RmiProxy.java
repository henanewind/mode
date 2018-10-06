package wind.mode.proxy.client;

import wind.mode.proxy.rmi.model.Student;
import wind.mode.proxy.rmi.StudentService;

import java.rmi.Naming;
import java.util.List;

public class RmiProxy {
    public static void main( String[] args )
    {
        try {
            StudentService studentService=(StudentService) Naming.lookup("rmi://127.0.0.1:5008/StudentService");
            List<Student> list = studentService.getList();
            for (Student s : list) {
                System.out.println("姓名："+s.getName()+",年龄："+s.getAge());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
