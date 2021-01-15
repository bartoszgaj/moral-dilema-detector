//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.4
//
// <auto-generated>
//
// Generated from file `adapter.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package adapter;

public interface RoadAttributesPrx extends BaseItemPrx
{
    default void setMotorway(boolean isMotorway)
    {
        setMotorway(isMotorway, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setMotorway(boolean isMotorway, java.util.Map<String, String> context)
    {
        _iceI_setMotorwayAsync(isMotorway, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setMotorwayAsync(boolean isMotorway)
    {
        return _iceI_setMotorwayAsync(isMotorway, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setMotorwayAsync(boolean isMotorway, java.util.Map<String, String> context)
    {
        return _iceI_setMotorwayAsync(isMotorway, context, false);
    }

    /**
     * @hidden
     * @param iceP_isMotorway -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setMotorwayAsync(boolean iceP_isMotorway, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setMotorway", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeBool(iceP_isMotorway);
                 }, null);
        return f;
    }

    default void setUrban(boolean isUrban)
    {
        setUrban(isUrban, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setUrban(boolean isUrban, java.util.Map<String, String> context)
    {
        _iceI_setUrbanAsync(isUrban, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setUrbanAsync(boolean isUrban)
    {
        return _iceI_setUrbanAsync(isUrban, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setUrbanAsync(boolean isUrban, java.util.Map<String, String> context)
    {
        return _iceI_setUrbanAsync(isUrban, context, false);
    }

    /**
     * @hidden
     * @param iceP_isUrban -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setUrbanAsync(boolean iceP_isUrban, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setUrban", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeBool(iceP_isUrban);
                 }, null);
        return f;
    }

    default void setServiceArea(boolean isServiceArea)
    {
        setServiceArea(isServiceArea, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setServiceArea(boolean isServiceArea, java.util.Map<String, String> context)
    {
        _iceI_setServiceAreaAsync(isServiceArea, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setServiceAreaAsync(boolean isServiceArea)
    {
        return _iceI_setServiceAreaAsync(isServiceArea, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setServiceAreaAsync(boolean isServiceArea, java.util.Map<String, String> context)
    {
        return _iceI_setServiceAreaAsync(isServiceArea, context, false);
    }

    /**
     * @hidden
     * @param iceP_isServiceArea -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setServiceAreaAsync(boolean iceP_isServiceArea, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setServiceArea", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeBool(iceP_isServiceArea);
                 }, null);
        return f;
    }

    default void setControlledAccess(boolean isControlledAccess)
    {
        setControlledAccess(isControlledAccess, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setControlledAccess(boolean isControlledAccess, java.util.Map<String, String> context)
    {
        _iceI_setControlledAccessAsync(isControlledAccess, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setControlledAccessAsync(boolean isControlledAccess)
    {
        return _iceI_setControlledAccessAsync(isControlledAccess, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setControlledAccessAsync(boolean isControlledAccess, java.util.Map<String, String> context)
    {
        return _iceI_setControlledAccessAsync(isControlledAccess, context, false);
    }

    /**
     * @hidden
     * @param iceP_isControlledAccess -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setControlledAccessAsync(boolean iceP_isControlledAccess, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setControlledAccess", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeBool(iceP_isControlledAccess);
                 }, null);
        return f;
    }

    default void setToll(boolean isToll)
    {
        setToll(isToll, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setToll(boolean isToll, java.util.Map<String, String> context)
    {
        _iceI_setTollAsync(isToll, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setTollAsync(boolean isToll)
    {
        return _iceI_setTollAsync(isToll, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setTollAsync(boolean isToll, java.util.Map<String, String> context)
    {
        return _iceI_setTollAsync(isToll, context, false);
    }

    /**
     * @hidden
     * @param iceP_isToll -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setTollAsync(boolean iceP_isToll, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setToll", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeBool(iceP_isToll);
                 }, null);
        return f;
    }

    default void setBridge(boolean isBridge)
    {
        setBridge(isBridge, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setBridge(boolean isBridge, java.util.Map<String, String> context)
    {
        _iceI_setBridgeAsync(isBridge, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setBridgeAsync(boolean isBridge)
    {
        return _iceI_setBridgeAsync(isBridge, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setBridgeAsync(boolean isBridge, java.util.Map<String, String> context)
    {
        return _iceI_setBridgeAsync(isBridge, context, false);
    }

    /**
     * @hidden
     * @param iceP_isBridge -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setBridgeAsync(boolean iceP_isBridge, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setBridge", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeBool(iceP_isBridge);
                 }, null);
        return f;
    }

    default void setTunnel(boolean isTunnel)
    {
        setTunnel(isTunnel, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setTunnel(boolean isTunnel, java.util.Map<String, String> context)
    {
        _iceI_setTunnelAsync(isTunnel, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setTunnelAsync(boolean isTunnel)
    {
        return _iceI_setTunnelAsync(isTunnel, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setTunnelAsync(boolean isTunnel, java.util.Map<String, String> context)
    {
        return _iceI_setTunnelAsync(isTunnel, context, false);
    }

    /**
     * @hidden
     * @param iceP_isTunnel -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setTunnelAsync(boolean iceP_isTunnel, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setTunnel", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeBool(iceP_isTunnel);
                 }, null);
        return f;
    }

    default void setFerry(boolean isFerry)
    {
        setFerry(isFerry, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void setFerry(boolean isFerry, java.util.Map<String, String> context)
    {
        _iceI_setFerryAsync(isFerry, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> setFerryAsync(boolean isFerry)
    {
        return _iceI_setFerryAsync(isFerry, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> setFerryAsync(boolean isFerry, java.util.Map<String, String> context)
    {
        return _iceI_setFerryAsync(isFerry, context, false);
    }

    /**
     * @hidden
     * @param iceP_isFerry -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_setFerryAsync(boolean iceP_isFerry, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "setFerry", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     ostr.writeBool(iceP_isFerry);
                 }, null);
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static RoadAttributesPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), RoadAttributesPrx.class, _RoadAttributesPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static RoadAttributesPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), RoadAttributesPrx.class, _RoadAttributesPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static RoadAttributesPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), RoadAttributesPrx.class, _RoadAttributesPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static RoadAttributesPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), RoadAttributesPrx.class, _RoadAttributesPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static RoadAttributesPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, RoadAttributesPrx.class, _RoadAttributesPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static RoadAttributesPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, RoadAttributesPrx.class, _RoadAttributesPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default RoadAttributesPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (RoadAttributesPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default RoadAttributesPrx ice_adapterId(String newAdapterId)
    {
        return (RoadAttributesPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default RoadAttributesPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (RoadAttributesPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default RoadAttributesPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (RoadAttributesPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default RoadAttributesPrx ice_invocationTimeout(int newTimeout)
    {
        return (RoadAttributesPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default RoadAttributesPrx ice_connectionCached(boolean newCache)
    {
        return (RoadAttributesPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default RoadAttributesPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (RoadAttributesPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default RoadAttributesPrx ice_secure(boolean b)
    {
        return (RoadAttributesPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default RoadAttributesPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (RoadAttributesPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default RoadAttributesPrx ice_preferSecure(boolean b)
    {
        return (RoadAttributesPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default RoadAttributesPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (RoadAttributesPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default RoadAttributesPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (RoadAttributesPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default RoadAttributesPrx ice_collocationOptimized(boolean b)
    {
        return (RoadAttributesPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default RoadAttributesPrx ice_twoway()
    {
        return (RoadAttributesPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default RoadAttributesPrx ice_oneway()
    {
        return (RoadAttributesPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default RoadAttributesPrx ice_batchOneway()
    {
        return (RoadAttributesPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default RoadAttributesPrx ice_datagram()
    {
        return (RoadAttributesPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default RoadAttributesPrx ice_batchDatagram()
    {
        return (RoadAttributesPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default RoadAttributesPrx ice_compress(boolean co)
    {
        return (RoadAttributesPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default RoadAttributesPrx ice_timeout(int t)
    {
        return (RoadAttributesPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default RoadAttributesPrx ice_connectionId(String connectionId)
    {
        return (RoadAttributesPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default RoadAttributesPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (RoadAttributesPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::adapter::RoadAttributes";
    }
}
