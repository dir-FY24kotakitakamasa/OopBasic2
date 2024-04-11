package company;

public class Sales extends Emproyee{
    public Sales(String name, Department department, String position, int employeeId){
        super(name, department, position, employeeId);
    }

    @Override
    public void joinMeeting() {
        department.meeting();
        System.out.println("→営業として参加。部署：" + department.getName() + "名前：" + name);
    }
}
