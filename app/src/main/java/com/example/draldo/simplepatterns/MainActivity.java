package com.example.draldo.simplepatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.draldo.simplepatterns.Factory.Animal;
import com.example.draldo.simplepatterns.Factory.AnimalFactory;
import com.example.draldo.simplepatterns.Factory.Fish;
import com.example.draldo.simplepatterns.Factory.Mammal;
import com.example.draldo.simplepatterns.RxJava.ObserverHelper;
import com.example.draldo.simplepatterns.Singleton.Tiger;

import rx.Observable;
import rx.Observer;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.a_main_et);
        mTextView = (TextView) findViewById(R.id.a_main_text);

        Tiger tigerToño = Tiger.getInstance();
        tigerToño.eat();

        Tiger tigerTigger = Tiger.getInstance();
        tigerTigger.eat();

        AnimalFactory animalFactory = new AnimalFactory();
        Animal animal = animalFactory.createFish();
        animal.sleep();

        Fish fishNemo = animalFactory.createFish();
        fishNemo.swim();
        Fish fishDory = animalFactory.createFish();
        fishDory.swim();;

        Mammal dumbo = animalFactory.createMammal();
        dumbo.run();
        Mammal simba = animalFactory.createMammal();
        simba.run();

        Observer<String> observer = ObserverHelper.createObserver();
        Observable<String> observable = ObserverHelper.createObservable();

        observable.subscribe(observer);
    }

    public void doMagic(View view) {
        Observer<String> observer = ObserverHelper.createObserver();
        String str = mEditText.getText().toString();
        Observable.just(str).subscribe(observer);
    }
}
