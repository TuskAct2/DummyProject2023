package frc.robot;

import org.carlmontrobotics.MotorConfig;
import org.carlmontrobotics.lib199.MotorControllerFactory;
import org.carlmontrobotics.lib199.swerve.SwerveModule;
import frc.robot.Constants.Drivetrain.*;

import com.revrobotics.CANSparkMax;

public class Drivetrain {
        
        CANSparkMax[] driveFL;
        CANSparkMax[] driveFR;
        CANSparkMax[] driveBL;
        CANSparkMax[] driveBR;


     SwerveModule moduleFL = new SwerveModule(SwerveModule.ModuleType.FL,
                    driveFL = MotorControllerFactory.createSparkMax(driveFrontLeftPort, MotorConfig.NEO),
                    MotorControllerFactory.createSparkMax(turnFrontLeftPort, MotorConfig.NEO),
                    MotorControllerFactory.createCANCoder(canCoderPortFL));
            // Forward-Right
            SwerveModule moduleFR = new SwerveModule( SwerveModule.ModuleType.FR,
                    driveFR = MotorControllerFactory.createSparkMax(driveFrontRightPort, MotorConfig.NEO),
                    MotorControllerFactory.createSparkMax(turnFrontRightPort, MotorConfig.NEO),
                    MotorControllerFactory.createCANCoder(canCoderPortFR));
            // Backward-Left
            SwerveModule moduleBL = new SwerveModule(SwerveModule.ModuleType.BL,
                    driveBL = MotorControllerFactory.createSparkMax(driveBackLeftPort, MotorConfig.NEO),
                    MotorControllerFactory.createSparkMax(turnBackLeftPort, MotorConfig.NEO),
                    MotorControllerFactory.createCANCoder(canCoderPortBL));
            // Backward-Right
            SwerveModule moduleBR = new SwerveModule(SwerveModule.ModuleType.BR,
                    driveBR = MotorControllerFactory.createSparkMax(driveBackRightPort, MotorConfig.NEO),
                    MotorControllerFactory.createSparkMax(turnBackRightPort, MotorConfig.NEO),
                    MotorControllerFactory.createCANCoder(canCoderPortBR));
    
}
