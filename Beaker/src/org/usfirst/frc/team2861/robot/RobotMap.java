/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2861.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

//  Import Needed Libraries
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.AnalogInput;

public class RobotMap {
	
	
	//********************************************************************************//
	//		Port Mapping
	//********************************************************************************//
	
	
	// 	PWM Ports
	public static final int leftMotorController = 0;
	public static final int rightMotorController = 1;
	public static final int auxMotorController = 2;
	public static final int kLeftServo = 3;
	public static final int kRightServo = 4;
	
	
	//	 DIO Ports
	public static final int leftMotorEncoderA = 0;
	public static final int leftMotorEncoderB = 1;
	public static final int rightMotorEncoderA = 2;
	public static final int rightMotorEncoderB = 3;
	public static final int auxMotorEncoderA = 4;
	public static final int auxMotorEncoderB = 5;
	public static final int kGyro = 6;
	public static final int kLimitSwitch = 7;
	public static final int leftUltrasonicRangeSensor = 8;
	public static final int rightUltrasonicRangeSensor = 9;
	
	
	// 	Joystick / Controller Ports
	public static final int kLeftJoy = 0;
	public static final int kRightJoy = 1;
	
	//******************************************************************************//
	//		Constants
	//*****************************************************************************//
	
	
	//	Ultrasonic Constants
	//	distance in inches the robot wants to stay from an object
	public static final double kHoldDistance = 12.0;
	//	factor to convert sensor values to hold a distance in inches
	public static final double kValueToInches = 0.125;
	
	
	//*****************************************************************************//
	//		Initialization
	//****************************************************************************//
	
	
	// 	Initialize DriveTrain
	public static Talon leftDrive = new Talon(leftMotorController);
	public static Talon rightDrive = new Talon (rightMotorController);
	
	
	
	// 	Initialize Other Motors / Servos
	public static Talon auxMotor = new Talon(auxMotorController);
	public static Servo leftServo = new Servo(kLeftServo);
	public static Servo rightServo = new Servo(kRightServo);
	
	
	// 	Initialize Sensors
	public static Encoder leftEncoder = new Encoder (leftMotorEncoderA, leftMotorEncoderB, false, Encoder.EncodingType.k2X);
	public static Encoder rightEncoder = new Encoder (rightMotorEncoderA, rightMotorEncoderB, false, Encoder.EncodingType.k2X);
	public static Encoder auxEncoder = new Encoder (auxMotorEncoderA, auxMotorEncoderB, false, Encoder.EncodingType.k2X);
	public static AnalogGyro gyro = new AnalogGyro (kGyro);
	public static DigitalInput limitSwitch = new DigitalInput (kLimitSwitch);
	public static AnalogInput leftUltrasonic = new AnalogInput (leftUltrasonicRangeSensor);
	public static AnalogInput rightUltrasonic = new AnalogInput (rightUltrasonicRangeSensor);
	

    // 	Initialize Joysticks
	public static Joystick leftJoy = new Joystick (kLeftJoy);
	public static Joystick rightJoy = new Joystick (kRightJoy);
}
