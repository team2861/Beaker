package org.usfirst.frc.team2861.robot.subsystems;



/**
 *	The Tank Modifier will take in a Source Trajectory and a Wheelbase Width and spit
 *	out a Trajectory for each side of the wheelbase.  This is commonly used in robotics
 *	for robots which have a drive system simlilar to a 'tank', where individual 
 *	parallel sides are driven independently.  The Source Trajectory is measured from
 *	the center of the drive base.  The modification will not modify the central
 *	trajectory.
 */

import org.usfirst.frc.team2861.robot.subsystems.PathfinderJNI;
import org.usfirst.frc.team2861.robot.subsystems.Trajectory;


public class TankModifier {

	Trajectory source, left, right;

    /**
     * Create an instance of the modifier
     * @param source The source (center) trajectory
     */
    public TankModifier(Trajectory source) {
        this.source = source;
    }

    /**
     * Generate the Trajectory Modification
     * @param wheelbase_width   The width (in meters) between the individual sides of the drivebase
     * @return                  self
     */
    public TankModifier modify(double wheelbase_width) {
        Trajectory[] trajs = PathfinderJNI.modifyTrajectoryTank(source, wheelbase_width);
        left = trajs[0];
        right = trajs[1];
        return this;
    }

    /**
     * Get the initial source trajectory
     * @return the source trajectory
     */
    public Trajectory getSourceTrajectory() {
        return source;
    }

    /**
     * Get the trajectory for the left side of the drive base
     * @return a trajectory for the left side
     */
    public Trajectory getLeftTrajectory() {
        return left;
    }

    /**
     * Get the trajectory for the right side of the drive base
     * @return a trajectory for the right side
     */
    public Trajectory getRightTrajectory() {
        return right;
    }
}

