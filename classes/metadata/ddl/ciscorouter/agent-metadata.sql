create table HNSD_CiscoRouterProvider (id number(19,0) not null, primary key (id));
create table UIM_CiscoInterface (id number(19,0) not null, InDiscards varchar2(3000), InUnknownProtos varchar2(3000), Type varchar2(3000), LastChange varchar2(3000), OutOctets varchar2(3000), InOctets varchar2(3000), InUcastPkts varchar2(3000), InError varchar2(3000), OutUcastPkts varchar2(3000), OutDiscards varchar2(3000), OutErrors varchar2(3000), primary key (id));
create table UIM_CiscoRouterInstComponent (id number(19,0) not null, CustomAgentHome varchar2(3000), CustomAgentName varchar2(3000), CustomAgentVendor varchar2(3000), ElementType varchar2(3000), Script varchar2(3000), primary key (id));
create table UIM_CiscoRouterMgmtInterface (id number(19,0) not null, primary key (id));
create table UIM_CiscoRouterMonInterface (id number(19,0) not null, PerformancePollingTime number(10,0), PerformancePollingFrequency varchar2(3000), primary key (id));
create table UIM_CiscoRouterNetworkElement (id number(19,0) not null, Script varchar2(3000), SystemUpTimeTxt varchar2(3000), primary key (id));
alter table HNSD_CiscoRouterProvider add constraint FK37FD882B6E68CC58 foreign key (id) references CIM_ManagedElement;
alter table UIM_CiscoInterface add constraint FKF17400264A1279D3 foreign key (id) references UIM_ManagedElement;
alter table UIM_CiscoRouterInstComponent add constraint FK4A908B3B5B85F668 foreign key (id) references UIM_ManagedElement;
alter table UIM_CiscoRouterMgmtInterface add constraint FKC2CB3F5CD3C0AA89 foreign key (id) references UIM_ManagedElement;
alter table UIM_CiscoRouterMonInterface add constraint FK55DFC1291C9D65F2 foreign key (id) references UIM_ManagedElement;
alter table UIM_CiscoRouterNetworkElement add constraint FKD5FEE38AE3B554D3 foreign key (id) references UIM_ManagedElement;
