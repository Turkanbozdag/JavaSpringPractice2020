package Practice1;

import java.util.ArrayList;

public class ScruumTeam {
    ArrayList<Tester>testersTeam=new ArrayList<>();
    public void hireATester(Tester tester){
        testersTeam.add(tester);
    }
    public void fireATester(long id){
        testersTeam.removeIf(p->p.employeeId==id);

    }
}
