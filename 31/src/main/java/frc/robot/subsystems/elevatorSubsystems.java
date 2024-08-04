package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class elevatorSubsystems extends SubsystemBase{
    
        private final Spark motor1 = new Spark(0);
        double speed;

        public void setMotor(double speed) {
            motor1.set(speed);  
        }
}
