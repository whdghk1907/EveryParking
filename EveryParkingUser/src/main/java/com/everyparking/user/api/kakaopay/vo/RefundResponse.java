package com.everyparking.user.api.kakaopay.vo;

import java.util.Date;

public class RefundResponse {

private String aid;
private String tid;
private String cid;
private String status;
private String partner_order_id;
private String partner_user_id;
private String payment_method_type;
private Amount amount;
private ApprovedCancelAmount approved_cancel_amount;
private CanceledAmount canceled_amount;
private CancelAvailableAmount cancel_available_amount;
private String item_name;
private String item_code;
private int quantity;
private Date created_at;
private Date approved_at;
private Date canceled_at;
private String payload;

    public RefundResponse() {
    }

    public RefundResponse(String aid, String tid, String cid, String status, String partner_order_id, String partner_user_id, String payment_method_type, Amount amount, ApprovedCancelAmount approved_cancel_amount, CanceledAmount canceled_amount, CancelAvailableAmount cancel_available_amount, String item_name, String item_code, int quantity, Date created_at, Date approved_at, Date canceled_at, String payload) {
        this.aid = aid;
        this.tid = tid;
        this.cid = cid;
        this.status = status;
        this.partner_order_id = partner_order_id;
        this.partner_user_id = partner_user_id;
        this.payment_method_type = payment_method_type;
        this.amount = amount;
        this.approved_cancel_amount = approved_cancel_amount;
        this.canceled_amount = canceled_amount;
        this.cancel_available_amount = cancel_available_amount;
        this.item_name = item_name;
        this.item_code = item_code;
        this.quantity = quantity;
        this.created_at = created_at;
        this.approved_at = approved_at;
        this.canceled_at = canceled_at;
        this.payload = payload;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPartner_order_id() {
        return partner_order_id;
    }

    public void setPartner_order_id(String partner_order_id) {
        this.partner_order_id = partner_order_id;
    }

    public String getPartner_user_id() {
        return partner_user_id;
    }

    public void setPartner_user_id(String partner_user_id) {
        this.partner_user_id = partner_user_id;
    }

    public String getPayment_method_type() {
        return payment_method_type;
    }

    public void setPayment_method_type(String payment_method_type) {
        this.payment_method_type = payment_method_type;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public ApprovedCancelAmount getApproved_cancel_amount() {
        return approved_cancel_amount;
    }

    public void setApproved_cancel_amount(ApprovedCancelAmount approved_cancel_amount) {
        this.approved_cancel_amount = approved_cancel_amount;
    }

    public CanceledAmount getCanceled_amount() {
        return canceled_amount;
    }

    public void setCanceled_amount(CanceledAmount canceled_amount) {
        this.canceled_amount = canceled_amount;
    }

    public CancelAvailableAmount getCancel_available_amount() {
        return cancel_available_amount;
    }

    public void setCancel_available_amount(CancelAvailableAmount cancel_available_amount) {
        this.cancel_available_amount = cancel_available_amount;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_code() {
        return item_code;
    }

    public void setItem_code(String item_code) {
        this.item_code = item_code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getApproved_at() {
        return approved_at;
    }

    public void setApproved_at(Date approved_at) {
        this.approved_at = approved_at;
    }

    public Date getCanceled_at() {
        return canceled_at;
    }

    public void setCanceled_at(Date canceled_at) {
        this.canceled_at = canceled_at;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}
