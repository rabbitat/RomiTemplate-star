package frc.robot.autons;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.DriveDistance;
import frc.robot.commands.DriveTurn;
import frc.robot.commands.DriveArc;
import frc.robot.subsystems.Drivetrain;

public class YourAutonomous extends SequentialCommandGroup {
    public YourAutonomous(Drivetrain drivetrain) {
        addCommands(
            /*assuming you start at top left corner
             * edit parameters after testing
             * write auton for other scenario later
             * -christian yao 12/17/25
             */
            new DriveDistance(1, 10, drivetrain),
            new DriveTurn(1, 90, 10, drivetrain),
            new DriveTurn(1, 270, 10, drivetrain),
            new DriveTurn(1, 270, 10, drivetrain),
            new DriveTurn(1, 90, 0, drivetrain),
            new DriveArc(50, 35, drivetrain, 5)
        );
    }
}
