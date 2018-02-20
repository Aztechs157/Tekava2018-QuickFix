// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc157.FRC2018;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX platformplatformTalon;
    public static Encoder platformplatformQuad;
    public static DigitalInput platformplatformTopLimit;
    public static DigitalInput platformplatformBottomLimit;
    public static Encoder extensioncarriageQuad;
    public static WPI_TalonSRX extensionextensionTalon;
    public static DigitalInput extensionextensionTopLimit;
    public static DigitalInput extensionextensionBottomLimit;
    public static WPI_TalonSRX drivedriveRight1;
    public static WPI_TalonSRX drivedriveRight2;
    public static WPI_TalonSRX drivedriveLeft1;
    public static WPI_TalonSRX drivedriveLeft2;
    public static Encoder drivedriveRightQuad;
    public static Encoder drivedriveLeftQuad;
    public static AnalogGyro drivedriveGyro;
    public static WPI_TalonSRX grabberIntakeRightTalon;
    public static WPI_TalonSRX grabberintakeLeftTalon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @SuppressWarnings("deprecation")
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        platformplatformTalon = new WPI_TalonSRX(6);
        
        
        platformplatformQuad = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Platform", "platformQuad", platformplatformQuad);
        platformplatformQuad.setDistancePerPulse(0.0625);//0.02
        platformplatformQuad.setPIDSourceType(PIDSourceType.kRate);
        platformplatformTopLimit = new DigitalInput(6);
        LiveWindow.addSensor("Platform", "platformTopLimit", platformplatformTopLimit);
        
        platformplatformBottomLimit = new DigitalInput(7);
        LiveWindow.addSensor("Platform", "platformBottomLimit", platformplatformBottomLimit);
        
        extensioncarriageQuad = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Extension", "carriageQuad", extensioncarriageQuad);
        extensioncarriageQuad.setDistancePerPulse(0.025);//0.01
        extensioncarriageQuad.setPIDSourceType(PIDSourceType.kRate);
        extensionextensionTalon = new WPI_TalonSRX(7);
        
        
        extensionextensionTopLimit = new DigitalInput(12);
        LiveWindow.addSensor("Extension", "extensionTopLimit", extensionextensionTopLimit);
        
        extensionextensionBottomLimit = new DigitalInput(13);
        LiveWindow.addSensor("Extension", "extensionBottomLimit", extensionextensionBottomLimit);
        
        drivedriveRight1 = new WPI_TalonSRX(1);
        
        
        drivedriveRight2 = new WPI_TalonSRX(2);
        
        
        drivedriveLeft1 = new WPI_TalonSRX(8);
        
        
        drivedriveLeft2 = new WPI_TalonSRX(9);
        
        
        drivedriveRightQuad = new Encoder(14, 15, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "driveRightQuad", drivedriveRightQuad);
        drivedriveRightQuad.setDistancePerPulse(0.052333);
        drivedriveRightQuad.setPIDSourceType(PIDSourceType.kRate);
        drivedriveLeftQuad = new Encoder(16, 17, false, EncodingType.k4X);
        LiveWindow.addSensor("Drive", "driveLeftQuad", drivedriveLeftQuad);
        drivedriveLeftQuad.setDistancePerPulse(0.052333);
        drivedriveLeftQuad.setPIDSourceType(PIDSourceType.kRate);
        drivedriveGyro = new AnalogGyro(0);
        LiveWindow.addSensor("Drive", "driveGyro", drivedriveGyro);
        drivedriveGyro.setSensitivity(0.007);
        grabberIntakeRightTalon = new WPI_TalonSRX(3);
        
        
        grabberintakeLeftTalon = new WPI_TalonSRX(4);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
