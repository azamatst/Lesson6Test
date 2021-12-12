package com.example.lesson6test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

//    @Test
//    public void checkButtonVisibility(){
//        onView(withId(R.id.btn_add)).perform(click());
//        onView(withId(R.id.btn_sub)).check(matches(isDisplayed()));
//    }

    @Test
    public void checkAddCase() {
        onView(withId(R.id.et_num1)).perform(typeText("2"));
        onView(withId(R.id.et_num2)).perform(typeText("5"));
        onView(withId(R.id.btn_add)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("7")));
    }

    @Test
    public void checkSubCase() {
        onView(withId(R.id.et_num1)).perform(typeText("10"));
        onView(withId(R.id.et_num2)).perform(typeText("5"));
        onView(withId(R.id.btn_sub)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("5")));
    }

    @Test
    public void checkMultCase() {
        onView(withId(R.id.et_num1)).perform(typeText("2"));
        onView(withId(R.id.et_num2)).perform(typeText("5"));
        onView(withId(R.id.btn_multiply)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("10")));
    }

    @Test
    public void checkDivCase() {
        onView(withId(R.id.et_num1)).perform(typeText("10"));
        onView(withId(R.id.et_num2)).perform(typeText("5"));
        onView(withId(R.id.btn_div)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("2")));
    }

//    @Test
//    public void checkEmptyFieldCase() {
//        onView(withId(R.id.et_num1)).perform(typeText(""));
//        onView(withId(R.id.et_num2)).perform(typeText(""));
//        onView(withId(R.id.btn_add)).perform(click());
//        onView(withId(R.id.result)).check(matches(withText("")));
//    }
//
//    @Test
//    public void checkWordsCase() {
//        onView(withId(R.id.et_num1)).perform(typeText("vcx"));
//        onView(withId(R.id.et_num2)).perform(typeText("cxcxv"));
//        onView(withId(R.id.btn_add)).perform(click());
//        onView(withId(R.id.result)).check(matches(withText("")));
//    }
//
//    @Test
//    public void checkSpaceCase() {
//        onView(withId(R.id.et_num1)).perform(typeText(" 3"));
//        onView(withId(R.id.et_num2)).perform(typeText("3 "));
//        onView(withId(R.id.btn_add)).perform(click());
//        onView(withId(R.id.result)).check(matches(withText("6")));
//    }
}
