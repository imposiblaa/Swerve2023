// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class gameConstants {
        public static final Boolean blue = true;
    }

    public static final class swerveModConstants {
        public static final double wheelP = 3;
        public static final double wheelI = 0;
        public static final double wheelD = 0;

        public static final double driveP = 0.5;
        public static final double driveI = 0;
        public static final double driveD = 0;


        public static final double kCPR = 1;


        // Front Right module
        public static final class mod1 {
            public static final int turningMotorID = 1;
            public static final int drivingMotorID = 5;
            public static final int encoderID = 0;
            public static final double encoderOffset = 179.208966;
            public static final Boolean inverted = true;
            public static final Boolean driveInverted = false;
        }

        // Back Right module
        public static final class mod2 {
            public static final int turningMotorID = 2;
            public static final int drivingMotorID = 6;
            public static final int encoderID = 1;
            public static final double encoderOffset = 190.107402;
            public static final Boolean inverted = true;
            public static final Boolean driveInverted = false;
        }

        // Back Left module
        public static final class mod3 {
            public static final int turningMotorID = 3;
            public static final int drivingMotorID = 7;
            public static final int encoderID = 2;
            public static final double encoderOffset = 219.902321;
            public static final Boolean inverted = true;
            public static final Boolean driveInverted = true;
        }

        // Front Left module
        public static final class mod4 {
            public static final int turningMotorID = 4;
            public static final int drivingMotorID = 8;
            public static final int encoderID = 3;
            public static final double encoderOffset = 282.832002;
            public static final Boolean inverted = true;
            public static final Boolean driveInverted = true;
        }

    public static final class driveConstants {

        
        public static final Boolean calibrate = false;

        public static final double kWheelBase = 0.0508;
        public static final double kTrack = 0.0635;

        public static final double kThetaMultiplier = -20;
        public static final double kSpeedMultiplier = 2;

        public static final double moduleRotateThreshold = 0.1;

        public static final double kMaxSpeedMPS = 30;
        public static final double kMaxAcceleration = 3;
    }

    public static final class autoConstants {
        public static final double lookAhaid = 1; //time that the robot should look ahaid on its path during auto
    }

    }
}
