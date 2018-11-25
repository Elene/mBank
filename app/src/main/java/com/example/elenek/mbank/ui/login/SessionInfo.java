package com.example.elenek.mbank.ui.login;

import com.google.gson.annotations.SerializedName;

public class SessionInfo {
    @SerializedName("SessionId")
    private String sessionId;
    @SerializedName("SessionDetails")
    private SessionDetails sessionDetails;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public SessionDetails getSessionDetails() {
        return sessionDetails;
    }

    public void setSessionDetails(SessionDetails sessionDetails) {
        this.sessionDetails = sessionDetails;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @SerializedName("UserDetails")
    private UserDetails userDetails;

    class SessionDetails {
        @SerializedName("IsChannelActive")
        private Boolean isChannelActive;
        @SerializedName("SessionTimeout")
        private Integer sessionTimeout;

        public Boolean getChannelActive() {
            return isChannelActive;
        }

        public void setChannelActive(Boolean channelActive) {
            isChannelActive = channelActive;
        }

        public Integer getSessionTimeout() {
            return sessionTimeout;
        }

        public void setSessionTimeout(Integer sessionTimeout) {
            this.sessionTimeout = sessionTimeout;
        }
    }

    class UserDetails {
        @SerializedName("UserId")
        private Integer userId;
        @SerializedName("Username")
        private String username;
        @SerializedName("Name")
        private String name;
        @SerializedName("LastName")
        private String lastName;
        @SerializedName("PhoneForSms")
        private String phoneForSms;
        @SerializedName("Active")
        private Boolean isActive;

        public Integer getUserId() {
            return userId;
        }

        public void setUserId(Integer userId) {
            this.userId = userId;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPhoneForSms() {
            return phoneForSms;
        }

        public void setPhoneForSms(String phoneForSms) {
            this.phoneForSms = phoneForSms;
        }

        public Boolean getActive() {
            return isActive;
        }

        public void setActive(Boolean active) {
            isActive = active;
        }
    }



}
