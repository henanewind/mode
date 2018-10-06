package wind.mode.proxy.rmi;

import wind.mode.proxy.rmi.model.Student;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface StudentService extends Remote {
    List<Student> getList() throws RemoteException;
}
