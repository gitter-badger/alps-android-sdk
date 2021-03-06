package io.matchmore.sdk.api


import io.matchmore.sdk.api.models.*
import retrofit2.Call
import retrofit2.http.*


interface DeviceApi {

    /**
     * Get IBeacons triples for all registered devices
     * Keys in map are device UUIDs and values are IBeacon triples. In model you can see example values \&quot;property1\&quot; \&quot;property2\&quot; \&quot;property3\&quot; instead of random UUIDs this is generated by OpenApi document browser
     * @return Call&lt;IBeaconTriples&gt;
     */
    @Headers("Content-Type:application/json")
    @GET("devices/IBeaconTriples")
    fun getIBeaconTriples(): Call<IBeaconTriples>

    /**
     * Create a device
     *
     * @param device The device to be created. (required)
     * @return Call&lt;Device&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("devices")
    fun createDevice(
            @Body device: Device
    ): Call<Device>


    /**
     * Create a device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @param device The device to be updated. (required)
     * @return Call&lt;Device&gt;
     */
    @Headers("Content-Type:application/json")
    @PATCH("devices/{deviceId}")
    fun updateDevice(
            @Path("deviceId") deviceId: String,@Body device: Device
    ): Call<Device>

    /**
     * Create a new location for a device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @param location Location to create for a device.  (required)
     * @return Call&lt;Location&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("devices/{deviceId}/locations")
    fun createLocation(
            @Path("deviceId") deviceId: String, @Body location: MatchmoreLocation
    ): Call<MatchmoreLocation>

    /**
     * Create a publication for a device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @param publication Publication to create on a device.  (required)
     * @return Call&lt;Publication&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("devices/{deviceId}/publications")
    fun createPublication(
            @Path("deviceId") deviceId: String, @Body publication: Publication
    ): Call<Publication>

    /**
     * Create a subscription for a device
     *
     * @param deviceId The id (UUID) of the device.  (required)
     * @param subscription Subscription to create on a device.  (required)
     * @return Call&lt;Subscription&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("devices/{deviceId}/subscriptions")
    fun createSubscription(
            @Path("deviceId") deviceId: String, @Body subscription: Subscription
    ): Call<Subscription>

    /**
     * Delete an existing device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @return Call&lt;Void&gt;
     */
    @Headers("Content-Type:application/json")
    @DELETE("devices/{deviceId}")
    fun deleteDevice(
            @Path("deviceId") deviceId: String
    ): Call<Void>

    /**
     * Delete a Publication
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @param publicationId The id (UUID) of the subscription. (required)
     * @return Call&lt;Void&gt;
     */
    @Headers("Content-Type:application/json")
    @DELETE("devices/{deviceId}/publications/{publicationId}")
    fun deletePublication(
            @Path("deviceId") deviceId: String, @Path("publicationId") publicationId: String
    ): Call<Void>

    /**
     * Delete a Subscription
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @param subscriptionId The id (UUID) of the subscription. (required)
     * @return Call&lt;Void&gt;
     */
    @Headers("Content-Type:application/json")
    @DELETE("devices/{deviceId}/subscriptions/{subscriptionId}")
    fun deleteSubscription(
            @Path("deviceId") deviceId: String, @Path("subscriptionId") subscriptionId: String
    ): Call<Void>

    /**
     * Info about a device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @return Call&lt;Device&gt;
     */
    @Headers("Content-Type:application/json")
    @GET("devices/{deviceId}")
    fun getDevice(
            @Path("deviceId") deviceId: String
    ): Call<Device>


    /**
     * Get matches for the device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @return Call&lt;Matches&gt;
     */
    @Headers("Content-Type:application/json")
    @GET("devices/{deviceId}/matches")
    fun getMatches(
            @Path("deviceId") deviceId: String
    ): Call<Matches>

    /**
     * Info about a publication on a device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @param publicationId The id (UUID) of the publication. (required)
     * @return Call&lt;Publication&gt;
     */
    @Headers("Content-Type:application/json")
    @GET("devices/{deviceId}/publications/{publicationId}")
    fun getPublication(
            @Path("deviceId") deviceId: String, @Path("publicationId") publicationId: String
    ): Call<Publication>

    /**
     * Get all publications for a device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @return Call&lt;Publications&gt;
     */
    @Headers("Content-Type:application/json")
    @GET("devices/{deviceId}/publications")
    fun getPublications(
            @Path("deviceId") deviceId: String
    ): Call<Publications>

    /**
     * Info about a subscription on a device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @param subscriptionId The id (UUID) of the subscription. (required)
     * @return Call&lt;Subscription&gt;
     */
    @Headers("Content-Type:application/json")
    @GET("devices/{deviceId}/subscriptions/{subscriptionId}")
    fun getSubscription(
            @Path("deviceId") deviceId: String, @Path("subscriptionId") subscriptionId: String
    ): Call<Subscription>

    /**
     * Get all subscriptions for a device
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @return Call&lt;Subscriptions&gt;
     */
    @Headers("Content-Type:application/json")
    @GET("devices/{deviceId}/subscriptions")
    fun getSubscriptions(
            @Path("deviceId") deviceId: String
    ): Call<Subscriptions>

    /**
     * Trigger the proximity event between a device and a ranged BLE iBeacon
     *
     * @param deviceId The id (UUID) of the device. (required)
     * @param proximityEvent The proximity event to be created for the device. (required)
     * @return Call&lt;ProximityEvent&gt;
     */
    @Headers("Content-Type:application/json")
    @POST("devices/{deviceId}/proximityEvents")
    fun triggerProximityEvents(
            @Path("deviceId") deviceId: String, @Body proximityEvent: ProximityEvent
    ): Call<ProximityEvent>

}
