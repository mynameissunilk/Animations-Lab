package generalassembly.yuliyakaleda.startercode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    List<String> mWishList;
    //Stack<String> mWishList;
    EditText mEditText;
    Button mButton;
    TextView mTextView;
    ListView mListView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);


      mWishList = new Stack<>();
      mEditText = (EditText)findViewById(R.id.wishedittext);
      mButton = (Button)findViewById(R.id.wishbutton);
      mTextView = (TextView)findViewById(R.id.wishtextview);
      mListView = (ListView)findViewById(R.id.wishlistview);

      final ArrayAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mWishList);
      mListView.setAdapter(adapter);

      final Animation animation = AnimationUtils.loadAnimation(this, R.anim.animation);


      mButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String input = mEditText.getText().toString();
              mWishList.add(0,input);
              mTextView.setText(input);
              mTextView.startAnimation(animation);
              adapter.notifyDataSetChanged();

          }
      });

    //TODO: set up all the view and event listeners.



  }

    //@Override
  //public void onClick(View v) {
    // TODO: 1. get the text from the input field
    //       2. animate it in the center of the screen
    //       3. add it to the list wish
    //       4. clear the input field
  //}
}
