/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2861.robot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

//	Import Needed Libraries
import org.usfirst.frc.team2861.robot.RobotMap;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.
	
	public static Button Lbutton1 = new JoystickButton(RobotMap.leftJoy, 1),
					Lbutton2 = new JoystickButton(RobotMap.leftJoy, 2),
					Lbutton3 = new JoystickButton(RobotMap.leftJoy, 3),
					Lbutton4 = new JoystickButton(RobotMap.leftJoy, 4),
					Lbutton5 = new JoystickButton(RobotMap.leftJoy, 5),
					Lbutton6 = new JoystickButton(RobotMap.leftJoy, 6),
					Lbutton7 = new JoystickButton(RobotMap.leftJoy, 7),
					Lbutton8 = new JoystickButton(RobotMap.leftJoy, 8),
					Lbutton9 = new JoystickButton(RobotMap.leftJoy, 9),
					Lbutton10 = new JoystickButton(RobotMap.leftJoy, 10),
					Lbutton11 = new JoystickButton(RobotMap.leftJoy, 11);
	
	public static Button Rbutton1 = new JoystickButton(RobotMap.rightJoy, 1),
					Rbutton2 = new JoystickButton(RobotMap.rightJoy, 2),
					Rbutton3 = new JoystickButton(RobotMap.rightJoy, 3),
					Rbutton4 = new JoystickButton(RobotMap.rightJoy, 4),
					Rbutton5 = new JoystickButton(RobotMap.rightJoy, 5),
					Rbutton6 = new JoystickButton(RobotMap.rightJoy, 6),
					Rbutton7 = new JoystickButton(RobotMap.rightJoy, 7),
					Rbutton8 = new JoystickButton(RobotMap.rightJoy, 8),
					Rbutton9 = new JoystickButton(RobotMap.rightJoy, 9),
					Rbutton10 = new JoystickButton(RobotMap.rightJoy, 10),
					Rbutton11 = new JoystickButton(RobotMap.rightJoy, 11);
					
	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand()); Ian is cool!
}
