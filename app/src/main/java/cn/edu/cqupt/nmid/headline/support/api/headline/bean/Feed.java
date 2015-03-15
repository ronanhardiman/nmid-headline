package cn.edu.cqupt.nmid.headline.support.api.headline.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;

public class Feed implements Parcelable {
  //do not use `id` because it has been defined in Model
  @SerializedName(value = "id") int idMember;

  int category;

  String title;

  @SerializedName("simple_content") String simpleContent;

  String image1;

  String image2;

  String image3;

  @SerializedName("time_release") String timeRelease;

  boolean isCollect;

  public boolean isCollect() {
    return isCollect;
  }

  public void setCollect(boolean isCollect) {
    this.isCollect = isCollect;
  }

  public int getIdMember() {
    return idMember;
  }

  public void setIdMember(int idMember) {
    this.idMember = idMember;
  }

  /**
   * @return The category
   */
  public int getCategory() {
    return category;
  }

  /**
   * @param category The category
   */
  public void setCategory(int category) {
    this.category = category;
  }

  /**
   * @return The title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title The title
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * @return The simpleContent
   */
  public String getSimpleContent() {
    return simpleContent;
  }

  /**
   * @param simpleContent The simpleContent
   */
  public void setSimpleContent(String simpleContent) {
    this.simpleContent = simpleContent;
  }

  /**
   * @return The image1
   */
  public String getImage1() {
    return image1;
  }

  /**
   * @param image1 The image1
   */
  public void setImage1(String image1) {
    this.image1 = image1;
  }

  /**
   * @return The image2
   */
  public String getImage2() {
    return image2;
  }

  /**
   * @param image2 The image2
   */
  public void setImage2(String image2) {
    this.image2 = image2;
  }

  /**
   * @return The image3
   */
  public String getImage3() {
    return image3;
  }

  /**
   * @param image3 The image3
   */
  public void setImage3(String image3) {
    this.image3 = image3;
  }

  /**
   * @return The timeRelease
   */
  public String getTimeRelease() {
    return timeRelease;
  }

  /**
   * @param timeRelease The timeRelease
   */
  public void setTimeRelease(String timeRelease) {
    this.timeRelease = timeRelease;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeInt(this.idMember);
    dest.writeInt(this.category);
    dest.writeString(this.title);
    dest.writeString(this.simpleContent);
    dest.writeString(this.image1);
    dest.writeString(this.image2);
    dest.writeString(this.image3);
    dest.writeString(this.timeRelease);
    dest.writeByte(isCollect ? (byte) 1 : (byte) 0);
  }

  public Feed() {
  }

  public Feed(int idMember, int category, String title, String simpleContent, String image1,
      String image2, String image3, String timeRelease, boolean isCollect) {
    this.idMember = idMember;
    this.category = category;
    this.title = title;
    this.simpleContent = simpleContent;
    this.image1 = image1;
    this.image2 = image2;
    this.image3 = image3;
    this.timeRelease = timeRelease;
    this.isCollect = isCollect;
  }

  private Feed(Parcel in) {
    this.idMember = in.readInt();
    this.category = in.readInt();
    this.title = in.readString();
    this.simpleContent = in.readString();
    this.image1 = in.readString();
    this.image2 = in.readString();
    this.image3 = in.readString();
    this.timeRelease = in.readString();
    this.isCollect = in.readByte() != 0;
  }

  public static final Parcelable.Creator<Feed> CREATOR = new Parcelable.Creator<Feed>() {
    public Feed createFromParcel(Parcel source) {
      return new Feed(source);
    }

    public Feed[] newArray(int size) {
      return new Feed[size];
    }
  };
}
