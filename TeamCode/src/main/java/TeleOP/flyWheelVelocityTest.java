package TeleOP;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

@TeleOp (name="flyWheelVelocityTest" ,group = "")

public class flyWheelVelocityTest extends LinearOpMode

{
    //degrees per second
    private double speed = 2000;
    boolean whenUp = true;
    boolean whenUp2 = true;

    public void runOpMode()
    {
        waitForStart();

        while (opModeIsActive())
        {
            DcMotorEx motorRF = hardwareMap.get(DcMotorEx.class, "motorRF");
            motorRF.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
            motorRF.setVelocity(speed);

            if(gamepad1.dpad_up && whenUp)
            {
                speed += 100;
                whenUp = false;
            }
            else if(!gamepad1.dpad_up)
            {
                whenUp = true;
            }


            if(gamepad1.dpad_down && whenUp2)
            {
                speed -= 100;
                whenUp2 = false;
            }
            else if(!gamepad1.dpad_down)
            {
                whenUp2 = true;
            }


            telemetry.addData("whenUp", whenUp);
            telemetry.addData("speed", speed);
            telemetry.update();

        }
    }
}
