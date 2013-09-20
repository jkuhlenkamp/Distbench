/**
 * ProfitbricksApiServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.profitbricks.api.ws;

public interface ProfitbricksApiServicePortType extends java.rmi.Remote {
    public com.profitbricks.api.ws.CreateDcResponse createDataCenter(java.lang.String dataCenterName, com.profitbricks.api.ws.Region region) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse updateDataCenter(com.profitbricks.api.ws.UpdateDcRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse clearDataCenter(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.RequestResponse deleteDataCenter(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.DataCenterIdentifier[] getAllDataCenters() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.CreateServerResponse createServer(com.profitbricks.api.ws.CreateServerRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse updateServer(com.profitbricks.api.ws.UpdateServerRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse deleteServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.RequestResponse stopServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.RequestResponse startServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.RequestResponse resetServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Server getServer(java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.CreateNicResponse createNic(com.profitbricks.api.ws.CreateNicRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse deleteNic(java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse updateNic(com.profitbricks.api.ws.UpdateNicRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Nic getNic(java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse setInternetAccess(java.lang.String dataCenterId, java.lang.Integer lanId, boolean internetAccess) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.CreateStorageResponse createStorage(com.profitbricks.api.ws.CreateStorageRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse updateStorage(com.profitbricks.api.ws.UpdateStorageRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse deleteStorage(java.lang.String storageId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse connectStorageToServer(com.profitbricks.api.ws.ConnectStorageRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse disconnectStorageFromServer(java.lang.String storageId, java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Image[] getAllImages() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.RequestResponse setImageOsType(java.lang.String imageId, com.profitbricks.api.ws.OsType osType) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse addRomDriveToServer(com.profitbricks.api.ws.RomDriveRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse removeRomDriveFromServer(java.lang.String imageId, java.lang.String serverId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Image getImage(java.lang.String imageId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.DataCenter getDataCenter(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.ProvisioningState getDataCenterState(java.lang.String dataCenterId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Storage getStorage(java.lang.String storageId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.IpBlockResponse reservePublicIpBlock(int blockSize, com.profitbricks.api.ws.Region region) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.RequestResponse releasePublicIpBlock(java.lang.String blockId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse addPublicIpToNic(java.lang.String ip, java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse removePublicIpFromNic(java.lang.String ip, java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.IpBlock[] getAllPublicIpBlocks() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.CreateLbResponse createLoadBalancer(com.profitbricks.api.ws.CreateLbRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse updateLoadBalancer(com.profitbricks.api.ws.UpdateLbRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse deleteLoadBalancer(java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.LoadBalancer getLoadBalancer(java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.RegisterLbServerResponse registerServersOnLoadBalancer(java.lang.String[] serverIds, java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse deregisterServersOnLoadBalancer(java.lang.String[] serverIds, java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse activateLoadBalancingOnServers(java.lang.String loadBalancerId, java.lang.String[] serverIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse deactivateLoadBalancingOnServers(java.lang.String loadBalancerId, java.lang.String[] serverIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Firewall addFirewallRulesToNic(com.profitbricks.api.ws.FirewallRuleRequest[] request, java.lang.String nicId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Firewall addFirewallRulesToLoadBalancer(com.profitbricks.api.ws.FirewallRuleRequest[] request, java.lang.String loadBalancerId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse removeFirewallRules(java.lang.String[] firewallRuleIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse activateFirewalls(java.lang.String[] firewallIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse deactivateFirewalls(java.lang.String[] firewallIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse deleteFirewalls(java.lang.String[] firewallIds) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Firewall getFirewall(java.lang.String firewallId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Snapshot[] getAllSnapshots() throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.RequestResponse updateSnapshot(com.profitbricks.api.ws.UpdateSnapshotRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Snapshot getSnapshot(java.lang.String snapshotId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.CreateSnapshotResponse createSnapshot(com.profitbricks.api.ws.CreateSnapshotRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.RequestResponse deleteSnapshot(java.lang.String snapshotId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.VersionResponse rollbackSnapshot(com.profitbricks.api.ws.RollbackSnapshotRequest request) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public com.profitbricks.api.ws.Notification[] getNotifications(java.lang.String networkUUID) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
    public void deleteNotifications(java.lang.String[] notificationId) throws java.rmi.RemoteException, com.profitbricks.api.ws.ProfitbricksServiceFault;
}
