/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class ElevatorSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    @Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    private Spark m_motor;
    private Encoder m_encoder;
    private final double k_speed = .5;

    public ElevatorSubsystem(Spark motor, Encoder encoder) {
        m_motor = motor;
        m_encoder = encoder;
    }

    public void goUp() {
        m_motor.set(k_speed);
    }

    public void goDown() {
        m_motor.set(-k_speed);
    }

    public void stop() {
        m_motor.stopMotor();
    }

}
