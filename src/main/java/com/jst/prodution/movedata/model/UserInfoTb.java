package com.jst.prodution.movedata.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * [STRATO MyBatis Generator]
 * Table: user_info_tb
@mbggenerated do_not_delete_during_merge 2017-11-09 11:38:55
 */
public class UserInfoTb implements Serializable {
    /**
     * Column: user_info_tb.id
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long id;

    /**
     * Column: user_info_tb.nickname
    @mbggenerated 2017-11-09 11:38:55
     */
    private String nickname;

    /**
     * Column: user_info_tb.password
    @mbggenerated 2017-11-09 11:38:55
     */
    private String password;

    /**
     * Column: user_info_tb.strid
    @mbggenerated 2017-11-09 11:38:55
     */
    private String strid;

    /**
     * Column: user_info_tb.sex
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long sex;

    /**
     * Column: user_info_tb.email
    @mbggenerated 2017-11-09 11:38:55
     */
    private String email;

    /**
     * Column: user_info_tb.phone
    @mbggenerated 2017-11-09 11:38:55
     */
    private String phone;

    /**
     * Column: user_info_tb.mobile
    @mbggenerated 2017-11-09 11:38:55
     */
    private String mobile;

    /**
     * Column: user_info_tb.address
    @mbggenerated 2017-11-09 11:38:55
     */
    private String address;

    /**
     * Column: user_info_tb.resume
    @mbggenerated 2017-11-09 11:38:55
     */
    private String resume;

    /**
     * Column: user_info_tb.reg_time
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long reg_time;

    /**
     * Column: user_info_tb.logon_time
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long logon_time;

    /**
     * Column: user_info_tb.logoff_time
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long logoff_time;

    /**
     *   22:���ߣ�23:�ڸڣ�(����Ա״̬)24:�ӳ���25:ȡ����26:С��
     * Column: user_info_tb.online_flag
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long online_flag;

    /**
     * Column: user_info_tb.comid
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long comid;

    /**
     * Column: user_info_tb.auth_flag
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long auth_flag;

    /**
     * Column: user_info_tb.balance
    @mbggenerated 2017-11-09 11:38:55
     */
    private BigDecimal balance;

    /**
     *   0:������1�����ã�2������ˣ�3�������䣬4����������5�޼�ֵ
     * Column: user_info_tb.state
    @mbggenerated 2017-11-09 11:38:55
     */
    private Integer state;

    /**
     *   �Ƽ��룬����ͣ��Ա���ʺ�
     * Column: user_info_tb.recom_code
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long recom_code;

    /**
     * Column: user_info_tb.md5pass
    @mbggenerated 2017-11-09 11:38:55
     */
    private String md5pass;

    /**
     *   �û���Ϣ�ʺţ�������Ϣ����
     * Column: user_info_tb.cid
    @mbggenerated 2017-11-09 11:38:55
     */
    private String cid;

    /**
     *   ����ID
     * Column: user_info_tb.department_id
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long department_id;

    /**
     *   ý����Դ
     * Column: user_info_tb.media
    @mbggenerated 2017-11-09 11:38:55
     */
    private Integer media;

    /**
     *   �Ƿ�����շѣ�0�����ԣ�1�����շ�
     * Column: user_info_tb.isview
    @mbggenerated 2017-11-09 11:38:55
     */
    private Integer isview;

    /**
     *   �շ�Ա�ϴ���ͼƬ����
     * Column: user_info_tb.collector_pics
    @mbggenerated 2017-11-09 11:38:55
     */
    private Integer collector_pics;

    /**
     *   �����Ա
     * Column: user_info_tb.collector_auditor
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long collector_auditor;

    /**
     *   �ֻ�����
     * Column: user_info_tb.imei
    @mbggenerated 2017-11-09 11:38:55
     */
    private String imei;

    /**
     *   0:android,1:ios
     * Column: user_info_tb.client_type
    @mbggenerated 2017-11-09 11:38:55
     */
    private Integer client_type;

    /**
     *   �汾��
     * Column: user_info_tb.version
    @mbggenerated 2017-11-09 11:38:55
     */
    private String version;

    /**
     * Column: user_info_tb.wxp_openid
    @mbggenerated 2017-11-09 11:38:55
     */
    private String wxp_openid;

    /**
     *   ΢����
     * Column: user_info_tb.wx_name
    @mbggenerated 2017-11-09 11:38:55
     */
    private String wx_name;

    /**
     *   ΢��ͷ���ַ
     * Column: user_info_tb.wx_imgurl
    @mbggenerated 2017-11-09 11:38:55
     */
    private String wx_imgurl;

    /**
     *   �̻���id
     * Column: user_info_tb.shop_id
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long shop_id;

    /**
     *   ���ö��
     * Column: user_info_tb.credit_limit
    @mbggenerated 2017-11-09 11:38:55
     */
    private BigDecimal credit_limit;

    /**
     *   �Ƿ���֤ͨ����0��1��
     * Column: user_info_tb.is_auth
    @mbggenerated 2017-11-09 11:38:55
     */
    private Integer is_auth;

    /**
     *   ���ͻ���
     * Column: user_info_tb.reward_score
    @mbggenerated 2017-11-09 11:38:55
     */
    private BigDecimal reward_score;

    /**
     *   �׵����
     * Column: user_info_tb.firstorderquota
    @mbggenerated 2017-11-09 11:38:55
     */
    private BigDecimal firstorderquota;

    /**
     *   ���������ȯ�ӵֿ۽��
     * Column: user_info_tb.rewardquota
    @mbggenerated 2017-11-09 11:38:55
     */
    private BigDecimal rewardquota;

    /**
     *   �Ƽ������   Ĭ��5��
     * Column: user_info_tb.recommendquota
    @mbggenerated 2017-11-09 11:38:55
     */
    private BigDecimal recommendquota;

    /**
     *   Ĭ��-1  ������
     * Column: user_info_tb.ticketquota
    @mbggenerated 2017-11-09 11:38:55
     */
    private BigDecimal ticketquota;

    /**
     *   �����˺�
     * Column: user_info_tb.hx_name
    @mbggenerated 2017-11-09 11:38:55
     */
    private String hx_name;

    /**
     *   ��������
     * Column: user_info_tb.hx_pass
    @mbggenerated 2017-11-09 11:38:55
     */
    private String hx_pass;

    /**
     *   ��ɫ
     * Column: user_info_tb.role_id
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long role_id;

    /**
     *   0��1��hide
     * Column: user_info_tb.order_hid
    @mbggenerated 2017-11-09 11:38:55
     */
    private Integer order_hid;

    /**
     *   �������
     * Column: user_info_tb.chanid
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long chanid;

    /**
     *   ���ű��
     * Column: user_info_tb.groupid
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long groupid;

    /**
     *   Ψһ���
     * Column: user_info_tb.uuid
    @mbggenerated 2017-11-09 11:38:55
     */
    private String uuid;

    /**
     *   ��Ӫ��˾���
     * Column: user_info_tb.company_id
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long company_id;

    /**
     *   �����߱��
     * Column: user_info_tb.creator_id
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long creator_id;

    /**
     *   �����̻����
     * Column: user_info_tb.cityid
    @mbggenerated 2017-11-09 11:38:55
     */
    private Long cityid;

    /**
     *   ���񿨺�
     * Column: user_info_tb.actno
    @mbggenerated 2017-11-09 11:38:55
     */
    private String actno;

    /**
     *   ���֤����
     * Column: user_info_tb.certno
    @mbggenerated 2017-11-09 11:38:55
     */
    private String certno;

    /**
     *   �Ƽ��룬�շ�Ա�Ƽ���
     * Column: user_info_tb.referral_code
    @mbggenerated 2017-11-09 11:38:55
     */
    private String referral_code;

    /**
     * Table: user_info_tb
    @mbggenerated 2017-11-09 11:38:55
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getStrid() {
        return strid;
    }

    public void setStrid(String strid) {
        this.strid = strid == null ? null : strid.trim();
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public Long getReg_time() {
        return reg_time;
    }

    public void setReg_time(Long reg_time) {
        this.reg_time = reg_time;
    }

    public Long getLogon_time() {
        return logon_time;
    }

    public void setLogon_time(Long logon_time) {
        this.logon_time = logon_time;
    }

    public Long getLogoff_time() {
        return logoff_time;
    }

    public void setLogoff_time(Long logoff_time) {
        this.logoff_time = logoff_time;
    }

    public Long getOnline_flag() {
        return online_flag;
    }

    public void setOnline_flag(Long online_flag) {
        this.online_flag = online_flag;
    }

    public Long getComid() {
        return comid;
    }

    public void setComid(Long comid) {
        this.comid = comid;
    }

    public Long getAuth_flag() {
        return auth_flag;
    }

    public void setAuth_flag(Long auth_flag) {
        this.auth_flag = auth_flag;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getRecom_code() {
        return recom_code;
    }

    public void setRecom_code(Long recom_code) {
        this.recom_code = recom_code;
    }

    public String getMd5pass() {
        return md5pass;
    }

    public void setMd5pass(String md5pass) {
        this.md5pass = md5pass == null ? null : md5pass.trim();
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public Integer getMedia() {
        return media;
    }

    public void setMedia(Integer media) {
        this.media = media;
    }

    public Integer getIsview() {
        return isview;
    }

    public void setIsview(Integer isview) {
        this.isview = isview;
    }

    public Integer getCollector_pics() {
        return collector_pics;
    }

    public void setCollector_pics(Integer collector_pics) {
        this.collector_pics = collector_pics;
    }

    public Long getCollector_auditor() {
        return collector_auditor;
    }

    public void setCollector_auditor(Long collector_auditor) {
        this.collector_auditor = collector_auditor;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public Integer getClient_type() {
        return client_type;
    }

    public void setClient_type(Integer client_type) {
        this.client_type = client_type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getWxp_openid() {
        return wxp_openid;
    }

    public void setWxp_openid(String wxp_openid) {
        this.wxp_openid = wxp_openid == null ? null : wxp_openid.trim();
    }

    public String getWx_name() {
        return wx_name;
    }

    public void setWx_name(String wx_name) {
        this.wx_name = wx_name == null ? null : wx_name.trim();
    }

    public String getWx_imgurl() {
        return wx_imgurl;
    }

    public void setWx_imgurl(String wx_imgurl) {
        this.wx_imgurl = wx_imgurl == null ? null : wx_imgurl.trim();
    }

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public BigDecimal getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(BigDecimal credit_limit) {
        this.credit_limit = credit_limit;
    }

    public Integer getIs_auth() {
        return is_auth;
    }

    public void setIs_auth(Integer is_auth) {
        this.is_auth = is_auth;
    }

    public BigDecimal getReward_score() {
        return reward_score;
    }

    public void setReward_score(BigDecimal reward_score) {
        this.reward_score = reward_score;
    }

    public BigDecimal getFirstorderquota() {
        return firstorderquota;
    }

    public void setFirstorderquota(BigDecimal firstorderquota) {
        this.firstorderquota = firstorderquota;
    }

    public BigDecimal getRewardquota() {
        return rewardquota;
    }

    public void setRewardquota(BigDecimal rewardquota) {
        this.rewardquota = rewardquota;
    }

    public BigDecimal getRecommendquota() {
        return recommendquota;
    }

    public void setRecommendquota(BigDecimal recommendquota) {
        this.recommendquota = recommendquota;
    }

    public BigDecimal getTicketquota() {
        return ticketquota;
    }

    public void setTicketquota(BigDecimal ticketquota) {
        this.ticketquota = ticketquota;
    }

    public String getHx_name() {
        return hx_name;
    }

    public void setHx_name(String hx_name) {
        this.hx_name = hx_name == null ? null : hx_name.trim();
    }

    public String getHx_pass() {
        return hx_pass;
    }

    public void setHx_pass(String hx_pass) {
        this.hx_pass = hx_pass == null ? null : hx_pass.trim();
    }

    public Long getRole_id() {
        return role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }

    public Integer getOrder_hid() {
        return order_hid;
    }

    public void setOrder_hid(Integer order_hid) {
        this.order_hid = order_hid;
    }

    public Long getChanid() {
        return chanid;
    }

    public void setChanid(Long chanid) {
        this.chanid = chanid;
    }

    public Long getGroupid() {
        return groupid;
    }

    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public Long getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    public Long getCreator_id() {
        return creator_id;
    }

    public void setCreator_id(Long creator_id) {
        this.creator_id = creator_id;
    }

    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno == null ? null : actno.trim();
    }

    public String getCertno() {
        return certno;
    }

    public void setCertno(String certno) {
        this.certno = certno == null ? null : certno.trim();
    }

    public String getReferral_code() {
        return referral_code;
    }

    public void setReferral_code(String referral_code) {
        this.referral_code = referral_code == null ? null : referral_code.trim();
    }
}