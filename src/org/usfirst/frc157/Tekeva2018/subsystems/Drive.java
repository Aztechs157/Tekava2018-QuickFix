// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc157.Tekeva2018.subsystems;

import java.text.DecimalFormat ; 

import org.usfirst.frc157.Tekeva2018.Robot;
import org.usfirst.frc157.Tekeva2018.RobotMap;
import org.usfirst.frc157.Tekeva2018.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import org.usfirst.frc157.Tekeva2018.OI;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class Drive extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
    private static int count=0;
    public boolean onestick = false;
    public boolean AttackDrive = false;
    public boolean ContrDrive = true;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Encoder leftQuad = RobotMap.driveLeftQuad;
    private final Encoder rightQuad = RobotMap.driveRightQuad;
    private final WPI_TalonSRX driveLeft1 = RobotMap.driveDriveLeft1;
    private final WPI_TalonSRX driveLeft2 = RobotMap.driveDriveLeft2;
    private final WPI_TalonSRX driveRight1 = RobotMap.driveDriveRight1;
    private final WPI_TalonSRX driveRight2 = RobotMap.driveDriveRight2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final Accelerometer accel = RobotMap.accel;
    private final AnalogGyro gyro = RobotMap.gyroAnalogGyro1;
    private final AnalogPotentiometer analogPotentiometer = RobotMap.motorControllerTeAnalogPotentiometer;
    private final AnalogPotentiometer potentiometer = RobotMap.autoSelect;
    @Override
    public void initDefaultCommand()
    {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        driveRight1.set(ControlMode.PercentOutput, 0.0);
        driveRight2.set(ControlMode.Follower, 2);
        driveLeft1.set(ControlMode.PercentOutput, 0.0);
        driveLeft2.set(ControlMode.Follower, 11);
        /*driveRight1.setNeutralMode(NeutralMode.Brake);
        driveRight2.setNeutralMode(NeutralMode.Brake);
        driveLeft1.setNeutralMode(NeutralMode.Brake);
        driveLeft2.setNeutralMode(NeutralMode.Brake);*/
        setDefaultCommand(new DriveWithSticks());
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    public double getAngle()
    {
        return gyro.getAngle();
    }
    public void DriveRobot()
    {
        //DecimalFormat numberFormat = new DecimalFormat("0.00");
        double potentiometer = .5; //analogPotentiometer.get();
        count++;
        if (count==100)
        {
            count=0;
        }
        double right = Robot.oi.getGamePadController().getRawAxis(Robot.oi.RYStick) * potentiometer;
        System.out.println(right);
        double left = -Robot.oi.getGamePadController().getRawAxis(Robot.oi.LYStick ) * potentiometer;
        System.out.println(left);
        if (!onestick)
        {
            if (AttackDrive)
            {
                double RatkPot = Robot.oi.getAttackR().getRawAxis(Robot.oi.RatkPot);
                double Latk = -Robot.oi.getAttackL().getRawAxis(Robot.oi.Latk) * (RatkPot * potentiometer);
                double Ratk = Robot.oi.getAttackR().getRawAxis(Robot.oi.Ratk) * (RatkPot * potentiometer);
                driveLeft1.set(Latk);
                driveRight1.set(Ratk);
            }
            else
            {
            driveRight1.set(left); // Change to RDrive * potentiometer
            driveLeft1.set(right); // Change to LDrive * potentiometer
            }
        }
        if (onestick)
        {
            double RxDrive = Robot.oi.getGamePadController().getRawAxis(Robot.oi.RxStick) * potentiometer;
            driveRight1.set((left + RxDrive));
            driveLeft1.set((-left + RxDrive));
        }

    }
    public double getLeftEncoder()
    {
        return leftQuad.getDistance();
    }
    public void resetLeftEncoder()
    {
        leftQuad.reset();
    }
    public double getRightEncoder()
    {
        return rightQuad.getDistance();
    }
    public void resetRightEncoder()
    {
        rightQuad.reset();
    }
    public void AutoDrive(double Rdrive, double Ldrive)
    {
        driveRight1.set(-Rdrive);
        driveLeft1.set(Ldrive);
    }
    public double[] getAccelerometer()
    {
        return new double[]{accel.getX(), accel.getY(), accel.getZ()};
    }
    public String debugPrint()
    {
        return "Right Encoder: " + getRightEncoder() + "\nLeft Encoder" + getLeftEncoder() + "\ngyro: " + getAngle();
    }
    public void brake()
    {
    }
    @Override
    public void periodic()
    {
        // Put code here to be run every loop
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

