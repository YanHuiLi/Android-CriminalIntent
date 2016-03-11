package android.bignerdranch.com.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Archer on 2016/3/7.
 */
public class Crime {

    public UUID getId() {
        return mId;
    }

    private UUID mId;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    private String mTitle;

    private Date mDate;
    private boolean mSolved;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public  Crime(){
        mId=UUID.randomUUID();
        mDate=new Date();
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
