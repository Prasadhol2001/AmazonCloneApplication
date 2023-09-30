package com.example.amazoncloneapplication;


import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class unitTesting {

    @Rule
    public ActivityScenarioRule<SplashScreenActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(SplashScreenActivity.class);

    @Test
    public void unitTesting() {
        ViewInteraction materialTextView = onView(
                allOf(withId(R.id.signInTextView), withText("Already a cusomer? sign in"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialTextView.perform(click());

        ViewInteraction materialTextView2 = onView(
                allOf(withId(R.id.signInTextView), withText("Already a cusomer? sign in"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        0),
                                3),
                        isDisplayed()));
        materialTextView2.perform(click());

        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.signInButton), withText("Sign In"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.FrameLayout")),
                                        1),
                                4),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction cardView = onView(
                allOf(withId(R.id.shapes1),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.HorizontalScrollView")),
                                        0),
                                0)));
        cardView.perform(scrollTo(), click());

        pressBack();

        ViewInteraction materialTextView3 = onView(
                allOf(withId(R.id.viewallProducts), withText("VIEW ALL"),
                        childAtPosition(
                                allOf(withId(R.id.home_layout),
                                        childAtPosition(
                                                withClassName(is("androidx.core.widget.NestedScrollView")),
                                                0)),
                                6),
                        isDisplayed()));
        materialTextView3.perform(click());

        ViewInteraction recyclerView = onView(
                allOf(withId(R.id.searchList),
                        childAtPosition(
                                withClassName(is("android.widget.FrameLayout")),
                                1)));
        recyclerView.perform(actionOnItemAtPosition(1, click()));

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.order), withText("Add to Cart"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("androidx.core.widget.NestedScrollView")),
                                        0),
                                7),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction materialRadioButton = onView(
                allOf(withId(R.id.bottom_cart), withText("My Cart"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                3),
                        isDisplayed()));
        materialRadioButton.perform(click());

        ViewInteraction materialRadioButton2 = onView(
                allOf(withId(R.id.bottom_cart), withText("My Cart"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                3),
                        isDisplayed()));
        materialRadioButton2.perform(click());

        ViewInteraction materialRadioButton3 = onView(
                allOf(withId(R.id.bottom_Profile), withText("Profile"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                4),
                        isDisplayed()));
        materialRadioButton3.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.profileUsername), withText("prasad2001"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                4)));
        appCompatEditText.perform(scrollTo(), replaceText("prasahol"));

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.profileUsername), withText("prasahol"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText2.perform(closeSoftKeyboard());

        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.done),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                0)));
        appCompatImageView.perform(scrollTo(), click());

        pressBack();

        ViewInteraction circleImageView = onView(
                allOf(withId(R.id.profileimage),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.ScrollView")),
                                        0),
                                2)));
        circleImageView.perform(scrollTo(), click());

        ViewInteraction materialTextView4 = onView(
                allOf(withId(R.id.profileHistory), withText("Your Orders"),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.widget.LinearLayout")),
                                        7),
                                0)));
        materialTextView4.perform(scrollTo(), click());

        pressBack();

        ViewInteraction materialRadioButton4 = onView(
                allOf(withId(R.id.bottom_search), withText("Search"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                2),
                        isDisplayed()));
        materialRadioButton4.perform(click());

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.searchEditText),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.viewtoolbar),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText3.perform(replaceText("dell"), closeSoftKeyboard());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.searchBtn), withText("SEARCH"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.viewtoolbar),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.searchEditText), withText("dell"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.viewtoolbar),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("Dell"));

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.searchEditText), withText("Dell"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.viewtoolbar),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText5.perform(closeSoftKeyboard());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.searchBtn), withText("SEARCH"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.viewtoolbar),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction recyclerView2 = onView(
                allOf(withId(R.id.searchList),
                        childAtPosition(
                                withClassName(is("android.widget.FrameLayout")),
                                1)));
        recyclerView2.perform(actionOnItemAtPosition(0, click()));

        pressBack();

        pressBack();

        ViewInteraction materialRadioButton5 = onView(
                allOf(withId(R.id.bottom_home), withText("Home"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                0),
                        isDisplayed()));
        materialRadioButton5.perform(click());

        ViewInteraction materialRadioButton6 = onView(
                allOf(withId(R.id.bottom_home), withText("Home"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                0),
                        isDisplayed()));
        materialRadioButton6.perform(click());

        DataInteraction linearLayout = onData(anything())
                .inAdapterView(allOf(withId(R.id.productslist),
                        childAtPosition(
                                withId(R.id.home_layout),
                                5)))
                .atPosition(0);
        linearLayout.perform(click());

        pressBack();

        ViewInteraction materialRadioButton7 = onView(
                allOf(withId(R.id.bottom_cart), withText("My Cart"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                3),
                        isDisplayed()));
        materialRadioButton7.perform(click());

        ViewInteraction recyclerView3 = onView(
                allOf(withId(R.id.cart_list),
                        childAtPosition(
                                withClassName(is("android.widget.RelativeLayout")),
                                1)));
        recyclerView3.perform(actionOnItemAtPosition(0, click()));

        ViewInteraction recyclerView4 = onView(
                allOf(withId(R.id.cart_list),
                        childAtPosition(
                                withClassName(is("android.widget.RelativeLayout")),
                                1)));
        recyclerView4.perform(actionOnItemAtPosition(0, click()));

        ViewInteraction materialButton = onView(
                allOf(withId(android.R.id.button1), withText("Yes"),
                        childAtPosition(
                                childAtPosition(
                                        withId(androidx.appcompat.R.id.buttonPanel),
                                        0),
                                3)));
        materialButton.perform(scrollTo(), click());

        ViewInteraction materialButton2 = onView(
                allOf(withId(android.R.id.button1), withText("Yes"),
                        childAtPosition(
                                childAtPosition(
                                        withId(androidx.appcompat.R.id.buttonPanel),
                                        0),
                                3)));
        materialButton2.perform(scrollTo(), click());

        ViewInteraction materialRadioButton8 = onView(
                allOf(withId(R.id.bottom_home), withText("Home"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                0),
                        isDisplayed()));
        materialRadioButton8.perform(click());

        ViewInteraction materialRadioButton9 = onView(
                allOf(withId(R.id.bottom_home), withText("Home"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                0),
                        isDisplayed()));
        materialRadioButton9.perform(click());

        ViewInteraction materialRadioButton10 = onView(
                allOf(withId(R.id.bottom_home), withText("Home"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                0),
                        isDisplayed()));
        materialRadioButton10.perform(click());

        ViewInteraction materialRadioButton11 = onView(
                allOf(withId(R.id.bottom_addproduct), withText("Add Product"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                1),
                        isDisplayed()));
        materialRadioButton11.perform(click());

        ViewInteraction materialRadioButton12 = onView(
                allOf(withId(R.id.bottom_cart), withText("My Cart"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                3),
                        isDisplayed()));
        materialRadioButton12.perform(click());

        ViewInteraction materialRadioButton13 = onView(
                allOf(withId(R.id.bottom_cart), withText("My Cart"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                3),
                        isDisplayed()));
        materialRadioButton13.perform(click());

        ViewInteraction materialRadioButton14 = onView(
                allOf(withId(R.id.bottom_Profile), withText("Profile"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                4),
                        isDisplayed()));
        materialRadioButton14.perform(click());

        ViewInteraction materialRadioButton15 = onView(
                allOf(withId(R.id.bottom_home), withText("Home"),
                        childAtPosition(
                                allOf(withId(R.id.radioGroup1),
                                        childAtPosition(
                                                withId(R.id.bottomNavBar),
                                                0)),
                                0),
                        isDisplayed()));
        materialRadioButton15.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
