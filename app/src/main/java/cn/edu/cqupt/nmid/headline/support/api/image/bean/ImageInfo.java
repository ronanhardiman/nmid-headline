package cn.edu.cqupt.nmid.headline.support.api.image.bean;

import java.util.HashMap;
import java.util.Map;

public class ImageInfo {

  private int id;
  private String imageurl;
  private String previrousurl;
  private String nickname;
  private String deviceinfo;
  private String uploadtime;
  private int count_praise;

  public int getCount_praise() {
    return count_praise;
  }

  public void setCount_praise(int count_praise) {
    this.count_praise = count_praise;
  }

  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  /**
   * @return The id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id The id
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return The imageurl
   */
  public String getImageurl() {
    return imageurl;
  }

  /**
   * @param imageurl The imageurl
   */
  public void setImageurl(String imageurl) {
    this.imageurl = imageurl;
  }

  /**
   * @return The previrousurl
   */
  public String getPrevirousurl() {
    return previrousurl;
  }

  /**
   * @param previrousurl The previrousurl
   */
  public void setPrevirousurl(String previrousurl) {
    this.previrousurl = previrousurl;
  }

  /**
   * @return The nickname
   */
  public String getNickname() {
    return nickname;
  }

  /**
   * @param nickname The nickname
   */
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  /**
   * @return The deviceinfo
   */
  public String getDeviceinfo() {
    return deviceinfo;
  }

  /**
   * @param deviceinfo The deviceinfo
   */
  public void setDeviceinfo(String deviceinfo) {
    this.deviceinfo = deviceinfo;
  }

  /**
   * @return The uploadtime
   */
  public String getUploadtime() {
    return uploadtime;
  }

  /**
   * @param uploadtime The uploadtime
   */
  public void setUploadtime(String uploadtime) {
    this.uploadtime = uploadtime;
  }

  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }
}
