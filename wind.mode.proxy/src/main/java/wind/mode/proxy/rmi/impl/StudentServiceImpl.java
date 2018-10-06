package wind.mode.proxy.rmi.impl;

import wind.mode.proxy.rmi.StudentService;
import wind.mode.proxy.rmi.model.Student;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wind
 * @date 2018/10/6
 * @since jdk1.8 获得模型数据的应用逻辑实现代码
 * @version 1.0
 */
public class StudentServiceImpl extends UnicastRemoteObject implements StudentService {
    public StudentServiceImpl() throws RemoteException {
    }

    /**
     * 获得学生列表集合
     * @return 学生集合
     */
    @Override
    public List<Student> getList() {  //throws RemoteException
        List<Student> list=new ArrayList<>();
        Student s1=new Student();
        s1.setName("张三");
        s1.setAge(15);
        Student s2=new Student();
        s2.setName("李四");
        s2.setAge(20);
        list.add(s1);
        list.add(s2);
        System.out.println("代理模式-远程代理调用Ok");
        return list;
    }
}
