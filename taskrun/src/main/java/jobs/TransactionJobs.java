package jobs;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.time.LocalDate;

@Singleton
@Startup
public class TransactionJobs {

    @Schedule(hour = "18,19", minute = "59,1,2,3", second = "*/5")
    public void printTransaction(){

        System.out.println("Horário: " + LocalDate.now());

    }

}
