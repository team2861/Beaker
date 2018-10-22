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
import org.usfirst.frc.team2861.robot.commands.Climb_Command;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {
	Joystick leftStick = new Joystick(RobotMap.kLeftJoy);
	Joystick rightStick = new Joystick(RobotMap.kRightJoy);
	public OI() {
		JoystickButton Climb = new JoystickButton(leftStick, 2);
		
		Climb.whileHeld(new Climb_Command());
	}
	public Joystick getLeftJoystick() {
		return leftStick;	
	}
	public Joystick getRightJoystick() {
		return rightStick;
	}
	
	
					
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
