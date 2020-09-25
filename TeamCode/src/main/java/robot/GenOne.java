package robot;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class GenOne
{
    public DcMotor motorRF;
    public DcMotor motorRB;
    public DcMotor motorLF;
    public DcMotor motorLB;

    public LinearOpMode linearOpMode;

    HardwareMap ahwMap = null;


    public GenOne(HardwareMap HardwareMap)
    {
        motorRF = linearOpMode.hardwareMap.dcMotor.get("motorRF");
        motorRB = linearOpMode.hardwareMap.dcMotor.get("motorRB");
        motorLF = linearOpMode.hardwareMap.dcMotor.get("motorLF");
        motorLB = linearOpMode.hardwareMap.dcMotor.get("motorLB");

        setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        this.linearOpMode = linearOpMode;
    }
    private void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior behavior)
    {
        motorRF.setZeroPowerBehavior(behavior);
        motorLF.setZeroPowerBehavior(behavior);
        motorLB.setZeroPowerBehavior(behavior);
        motorRB.setZeroPowerBehavior(behavior);
    }
    public GenOne()
    {

    }

}
