package lockdown.org.broadcastreceiver2;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Incomingsms extends BroadcastReceiver
{
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context,"You have received a new message",Toast.LENGTH_SHORT).show();
    }
}
