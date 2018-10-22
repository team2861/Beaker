package org.usfirst.frc.team2861.robot.commands;

import org.usfirst.frc.team2861.robot.OI;
import org.usfirst.frc.team2861.robot.Robot;


import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Climb_Command extends Command {

    public Climb_Command() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while(Robot.oi.getLeftJoystick().getRawButton(3) == true) {
    		Robot.Winch.climb();
    	}
    	
    	Robot.Winch.stop();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.Winch.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.Winch.stop();
    }
}
