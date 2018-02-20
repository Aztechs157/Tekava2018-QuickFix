// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc157.Tekeva2018;

// Auto generated imports
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // Talon Decelerations
    public static WPI_TalonSRX driveDriveLeft1;
    public static WPI_TalonSRX driveDriveLeft2;
    public static WPI_TalonSRX driveDriveRight1;
    public static WPI_TalonSRX driveDriveRight2;
    public static WPI_TalonSRX forkliftForksForkMotor;
    public static WPI_TalonSRX ElevatorMotor;

    // Encoder Decleration
    public static Encoder driveLeftQuad;
    public static Encoder driveRightQuad;
    public static Encoder forkEncoder;

    // Digital Input/Output (DIO) Decleration
    public static DigitalInput forkliftElevatorHighSwitch;
    public static DigitalInput forkliftElevatorLowSwitch;
    public static DigitalInput forkliftForksOpenSwitch;
    public static DigitalInput forkliftForksCloseSwitch;
    public static DigitalInput OpticalSwitch;

    // Analog Decelerations
    public static AnalogGyro gyroAnalogGyro1;
    public static AnalogPotentiometer motorControllerTeAnalogPotentiometer;
    public static AnalogPotentiometer autoSelect;

    //Accelerometer Declerartion
    public static Accelerometer accel;

    public static void init() {
        // Gyro Reader
        gyroAnalogGyro1 = new AnalogGyro(0);
        gyroAnalogGyro1.setSensitivity(0.007);

        // Accelerometer Pin
        accel = new BuiltInAccelerometer(Accelerometer.Range.k4G);

        // Wheel Encoder Pins
        driveLeftQuad = new Encoder(1, 2, true, EncodingType.k4X);
        driveLeftQuad.setDistancePerPulse(0.05); // (0.5) for in.
        driveLeftQuad.setPIDSourceType(PIDSourceType.kRate);
        driveRightQuad = new Encoder(3, 4, false, EncodingType.k4X);
        driveRightQuad.setDistancePerPulse(0.05); // (0.5) for in.s
        driveRightQuad.setPIDSourceType(PIDSourceType.kRate);

        // Fork Encoder Pins
        forkEncoder = new Encoder (10, 5, true, EncodingType.k4X);
        forkEncoder.setDistancePerPulse(0.03735353664); // (0.01867676832) For in.

        // Set Talon IDS
        driveDriveLeft1 = new WPI_TalonSRX(9);
        driveDriveLeft2 = new WPI_TalonSRX(8);
        driveDriveRight1 = new WPI_TalonSRX(2);
        driveDriveRight2 = new WPI_TalonSRX(1);
        forkliftForksForkMotor = new WPI_TalonSRX(5);
        ElevatorMotor = new WPI_TalonSRX(7);

        // Set DIO IDS
        OpticalSwitch = new DigitalInput(0); //TODO CHANGE 9 TO DIO ON NEW ROBOT
        forkliftForksOpenSwitch = new DigitalInput(7);
        forkliftForksCloseSwitch = new DigitalInput(6);
        forkliftElevatorHighSwitch = new DigitalInput(9);
        forkliftElevatorLowSwitch = new DigitalInput(8);

        // Set Analog IDS
        motorControllerTeAnalogPotentiometer = new AnalogPotentiometer(1, 1.0, 0.0); // (Pin, Scale, Offset)
        autoSelect = new AnalogPotentiometer(2, 5.5, -11);
    }
}
