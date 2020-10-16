package com.ly.agrManader.util;
/**
 * desc: 异常定义
 * */
public class ErrorConstants {
    private ErrorConstants(){}
    public static final class CommonError{
        private CommonError(){}
        /**
         * 缺失参数或有参数为空
         * */
        public static final String ERROR_CODE_MISSING_PARAM = "900001";
        public static final String ERROR_MESSAGE_MISSING_PARAM = "参数为空，请检验";

        /**
         *写入数据库失败
         * */
        public static final String ERROR_CODE_DB_WRITE_ERR = "900002";
        public static final String ERROR_MESSAGE_DB_WRITE_ERR = "写入数据库失败";
    }

    /**
     * 订单相关错误码
     */
    public static final class OrderError{
        private OrderError(){}

        /**
         * 创建订单错误码
         */
        public static final String ERROR_CODE_MONEY_UNEQUAL = "100001";
        public static final String ERROR_MSG_MONEY_UNEQUAL = "支付金额不等于实收金额";
        public static final String ERROR_CODE_COUP_UNUSE = "100002";
        public static final String ERROR_MSG_COUP_UNUSE = " 此优惠券不可使用!";
        public static final String ERROR_CODE_RECEIVE_MONEY_UNEQUAL = "100003";
        public static final String ERROR_MSG_RECEIVE_MONEY_UNEQUAL = " 商品总金额有误";
        public static final String ERROR_CODE_FACT_MONEY_UNEQUAL = "100004";
        public static final String ERROR_MSG_FACT_MONEY_UNEQUAL = "应付金额有误";
        public static final String ERROR_CODE_PREFERENTIAL_MONEY_UNEQUAL = "100005";
        public static final String ERROR_MSG_PREFERENTIAL_MONEY_UNEQUAL = "优惠金额有误";
        public static final String ERROR_CODE_ACTUALLYPAID_MONEY_UNEQUAL = "100012";
        public static final String ERROR_MSG_ACTUALLYPAID_MONEY_UNEQUAL = "实付金额有误";
        public static final String ERROR_CODE_GOODS_EXPIRE = "100006";//商品{名称}{id}已失效
        public static final String ERROR_CODE_GOODS_UNPUBLISH = "100007";//商品{名称}{id}未上架
        public static final String ERROR_CODE_GOODS_PRICE_UNSET = "100008";//商品{名称}{id}零售价格未指定
        public static final String ERROR_CODE_GOODS_PRICE_CHG = "100009";//商品{名称}{id}零售价格变动，请获取最新价格
        public static final String ERROR_CODE_GOODS_AMOUNT_ZORE = "100010";//商品{名称}{id}购买数量不能为零
        public static final String ERROR_CODE_GOODS_STOCk_LESS = "100011";//商品{名称}{id}库存不足
        public static final String ERROR_CODE_GOODS_DOWNPUBLISH = "1000012";//商品{名称}{id}已下架
        public static final String ERROR_CODE_GOODS_NO_SAME_SUPPLIERS = "1000013";//只能提交相同供货商类别的商品
        public static final String ERROR_CODE_GOODS_NO_SAME_ZERO = "1000014";//只能提交相同零库存模式商品

        /**
         * 更新，关闭订单错误码
         */
        public static final String ERROR_CODE_STOREOPER_UNEQUAL = "100030";
        public static final String ERROR_MSG_STOREOPER_UNEQUAL = "不是门店操作人员，不能进行此操作!";
        public static final String ERROR_CODE_ORDER_UNEXIST = "100031";
        public static final String ERROR_MSG_ORDER_UNEXIST = "订单查询失败,查询不到此订单!";
        public static final String ERROR_CODE_ORDER_OPER_PERMISSION = "100032";
        public static final String ERROR_MSG_ORDER_OPER_PERMISSION = "订单不归属此门店，不能进行此操作!";
        public static final String ERROR_CODE_ORDER_NO_UNPAY = "100033";
        public static final String ERROR_MSG_ORDER_NO_UNPAY = "订单状态不是待支付状态，不能进行此操作!";
        public static final String ERROR_CODE_ORDER_NO_WAITDELIVERY = "100034";
        public static final String ERROR_MSG_ORDER_NO_WAITDELIVERY = "订单状态不是待提货状态，不能进行此操作!";
        public static final String ERROR_MSG_ORDER_NO_DELIVERY = "订单状态不是配送中状态，不能进行此操作!";
        public static final String ERROR_CODE_ORDER_UPDATE_ERR = "100035";
        public static final String ERROR_MSG_ORDER_UPDATE_ERR = "订单更新有误，请联系系统管理员";
        public static final String ERROR_CODE_ORDER_CUSTSTATE_ERR = "100036";
        public static final String ERROR_MSG_ORDER_CUSTSTATE_ERR = "订单显示状态有误，请联系系统管理员";

        public static final String ERROR_CODE_PAYING = "100037";
        public static final String ERROR_MSG_PAYING = "和包支付正在扣款中";
        public static final String ERROR_CODE_INVALID_STORE = "100038";
        public static final String ERROR_MSG_INVALID_STORE = "下单失败（错误码 3245）";
        public static final String ERROR_CODE_QUERY_STORE = "100039";
        public static final String ERROR_MSG_QUERY_STORE = "获取门店信息失败";

        /**
         * 查询订单错误码
         */
        public static final String ERROR_CODE_QRY_ORDITEM_EMPTY = "100050";//查询[orderNo]订单明细为空!
        public static final String ERROR_CODE_QRY_ORDCHECKS_EMPTY = "100051";//查询[orderNo]收银信息为空!
        public static final String ERROR_CODE_QRY_ORDINFO_EMPTY = "100052";//查询[orderNo]订单信息为空!
        public static final String ERROR_CODE_QRY_ORDSTATUS_CHG_EMPTY = "100053";//查询[orderId]订单状态流信息为空!
        public static final String ERROR_CODE_WX_MONEY_UNEQUAL = "100054";//微信支付金额与订单金额不匹配
        public static final String ERROR_CODE_NO_EXITS_PAY_ORDER = "100055";//不存在待支付的流水订单
        public static final String ERROR_MSG_NO_EXITS_PAY_ORDER = "不存在待支付的流水订单";//不存在待支付的流水订单
        public static final String ERROR_CODE_NO_EXITS_STORE_MERCHANT = "100056";//根据门店未找到对应的商户，无法发起支付
        public static final String ERROR_MSG_NO_EXITS_STORE_MERCHANT = "根据门店未找到对应的商户，无法发起支付";//根据门店未找到对应的商户，无法发起支付
    }

    /**
     * 库存相关错误码
     */
    public static final class StockError{
        private StockError(){}

        /**
         * 操作库存错误码
         */
        public static final String ERROR_CODE_QRY_STOCK_ERR = "100201";//查询门店{}商品{}库存信息失败
        public static final String ERROR_CODE_QRY_STOCK_MORE_ERR = "100202";//查询门店{}商品{}库存信息失败,存在多个库存信息，请联系管理员
        public static final String ERROR_CODE_OCCUPY_STOCK_AMOUNT_LESS= "100203";//商品{名称}{id}预占库存小于释放的数量
        public static final String ERROR_CODE_STOCK_AMOUNT_LESS = "100204";//商品{名称}{id}库存数量小于释放的数量
        public static final String ERROR_CODE_STOCK_OCCUPY_OPER_ERR = "100205";//预占库存操作类型错误{操作类型}
        public static final String ERROR_CODE_STOCK_AMOUNT_NO_ENGOUH = "100206";//商品{名称}{id}库存不足


    }

    /**
     * 添加购物车相关错误码
     */
    public static final class ShoppingCartError{
        private ShoppingCartError(){}

        /**
         * 操作购物车错误码
         */
        public static final String ERROR_CODE_ALL_NO_GOODS = "100301";//全部商品已下架
        public static final String ERROR_MSG_ALL_NO_GOODS = "全部商品已下架";
        public static final String ERROR_CODE_ALL_NO_STOCK = "100302";//全部商品零库存
        public static final String ERROR_MSG_ALL_NO_STOCK= "全部商品零库存";
        public static final String ERROR_CODE_LESS_STOCK = "100303";//部分商品已无货
        public static final String ERROR_MSG_LESS_STOCK= "部分商品已无货";
        public static final String ERROR_CODE_ADD_CART_FAIL = "100305";//添加购物车失败
        public static final String ERROR_MSG_ADD_CART_FAIL = "添加购物车失败";
        public static final String ERROR_CODE_CHECK_CART_FAIL="100306";
        public static final String ERROR_MSG_CHECK_CART_FAIL = "请重新获取购物车商品信息";
        public static final String ERROR_CODE_CHECK_APP_CART_FAIL="100307";
        public static final String ERROR_MSG_CHECK_APP_CART_FAIL = "当前商品库存不足";
        public static final String ERROR_CODE_CHECK_STORE_MER_FAIL="100308";
        public static final String ERROR_MSG_CHECK_STORE_MER_FAIL = "该门店不存在支付商户信息";
        public static final String ERROR_CODE_STORE_MER_FAIL="100309";
        public static final String ERROR_MSG_STORE_MER_FAIL = "请到门店进行购买";


    }

    /**
     * 优惠券相关错误码
     */
    public static final class MemberCouponError{
        private MemberCouponError(){}

        /**
         * 优惠券相关错误码
         */
        public static final String ERROR_CODE_DISSATISFIED_COUPON = "100401";//当前优惠卷不满足使用条件
        public static final String ERROR_MSG_DISSATISFIED_COUPON = "当前优惠券不满足使用规则";//
        public static final String ERROR_CODE_APPLICATION_ERROR = "100402";
        public static final String ERROR_MESSAGE_APPLICATION_ERROR = "优惠券类型有误，不是全部线上商品，也不是部分线上商品";
        public static final String ERROR_CODE_DELETED_COU = "100403";
        public static final String ERROR_MESSAGE_DELETED_COU = "该优惠券未查询到供货商";

    }

    /**
     * 商品上下架相关错误码
     */
    public static final class GoodsUpDownError{
        private GoodsUpDownError(){}
        public static final String ERROR_CODE_GOODS_NOSTOCK = "100501";//商品无库存，不可上架
        public static final String ERROR_MSG_GOODS_NOSTOCK = "商品无库存，不可上架";

    }

    /**
     * 串码入库相关错误码
     */
    public static final class SaveOrderly{
        private SaveOrderly(){}
        public static final String ERROR_CODE_ORDERLY_LESS = "100601";
        public static final String ERROR_MSG_ORDERLY_LESS = "串号数量与商品数量不匹配";
        public static final String ERROR_CODE_DUPLICATE = "100701";
        public static final String ERROR_DESC_DUPLICATE = "有重复串码，请检查！";
        public static final String ERROR_CODE_REC_DUPLICATE = "100801";
        public static final String ERROR_DESC_REC_DUPLICATE = "传入的串码重复";

    }

    /**
     * 串码入库相关错误码
     */
    public static final class GoodQryError{
        private GoodQryError(){}
        public static final String ERROR_DESC_QRY_GOODS = "查询产商品失败";


    }

    /**
     * B2B商品查询错误码
     */
    public static final class B2BError{
        private B2BError(){}
        /**
         * 详情进入提示
         * */
        public static final String B2B_GOODS_STOCk_LESS_CODE = "CNR-20001";
        public static final String B2B_GOODS_STOCk_LESS_MESSAGE = "[CNR-20001] 该商品库存不足";
        //实际为价格倒挂
        public static final String B2B_GOODS_DELIVERY_PRICE_CODE = "CNR-20002";
        public static final String B2B_GOODS_DELIVERY_PRICE_MESSAGE = "[CNR-20002] 该商品已下架";
        public static final String B2B_ERROR_CODE_GOODS_DOWNPUBLISH_CODE= "CNR-20003";
        public static final String B2B_ERROR_CODE_GOODS_DOWNPUBLISH_MESSAGE = "[CNR-20003] 该商品已下架";

        /**
         * 购物车进入提示
         * */
        public static final String B2B_CAR_GOODS_STOCk_LESS_MESSAGE = "[CNR-20001] 部分商品库存不足，请重新确认购物车商品";
        //实际为价格倒挂
        public static final String B2B_CAR_GOODS_DELIVERY_PRICE_MESSAGE = "[CNR-20002] 部分商品已下架，请重新确认购物车商品";

        public static final String B2B_CAR_ERROR_CODE_GOODS_DOWNPUBLISH_MESSAGE = "[CNR-20003] 部分商品已下架，请重新确认购物车商品";

        //订单创建失败
        public static final String B2B_ERROR_CODE_ORDER_FAIL= "CNR-20004";
        public static final String B2B_ERROR_CODE_ORDER_MESSAGE = "[CNR-20004] 订单创建失败";
        //运费查询失败
        public static final String B2B_ERROR_CODE_FREIGHT_FAIL= "CNR-20005";
        public static final String B2B_ERROR_CODE_FREIGHT_MESSAGE = "[CNR-20005] 订单创建失败";

        //库存失败
        public static final String B2B_ERROR_CODE_LIMIT_FAIL= "CNR-20006";
        public static final String B2B_ERROR_CODE_LIMIT_FAIL_MESSAGE = "[CNR-20006] 您可购买折扣商品的数量已达上限~";

        public static final String B2B_ERROR_CODE_VALID_FAIL = "[CNR-20007]";
        public static final String B2B_ERROR_CODE_VALID_FAIL_MESSAGE = "[CNR-20007] 校验信息失败";

        //商品信息
        public static final String B2B_ERROR_CODE_AMOUNT_FAIL = "[CNR-20008]";
        public static final String B2B_ERROR_CODE_AMOUNT_FAIL_MESSAGE = "[CNR-20008] 商品购买数量不能为零";

        public static final String B2B_ERROR_CODE_PRICE_FAIL = "[CNR-20009]";
        public static final String B2B_ERROR_CODE_PRICE_FAIL_MESSAGE = "[CNR-20009] 改商品零售价格变动，请获取最新价格";
        public static final String B2B_CAR_ERROR_CODE_PRICE_FAIL_MESSAGE = "[CNR-20009] 部分商品零售价格变动，请获取最新价格";

    }

}
