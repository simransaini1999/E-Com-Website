//package Indigo.EECS4413Project.logic;
//
//import java.util.concurrent.atomic.AtomicInteger;
//
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
//
//@Service
//public class TimerDAO {
//
//	private static AtomicInteger timerValue = new AtomicInteger(10); // Initial timer value
//
//    @Scheduled(fixedRate = 1000) // Execute every 1000 milliseconds (1 second)
//    public void forwardTimer() {
//        int currentValue = timerValue.getAndDecrement();
//
//        if (currentValue >= 0) {
//            // Continue with your background task logic
//            System.out.println("Executing background task at " + currentValue);
//        } else {
//            // Timer has reached 0, invoke another controller or perform some action
//            System.out.println("Timer has reached 0. Invoking another controller...");
//
//        }
//    }
//
//
//
//
//	
//	public static void main(String[] args) {
//		TimerDAO time = new TimerDAO(); 
//		while(true) {
//		time.forwardTimer();
//		}
//		
//	}
//}
//
