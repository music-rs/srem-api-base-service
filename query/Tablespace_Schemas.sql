--drop tablespace DAT_SREM including contents and datafiles; 
--drop user USR_CFM;

--CREAR TABLESPACES 
create tablespace DAT_SREM
datafile 'C:\app\oracle\oradata\orcl\DAT_SREM.dbf' size 10M autoextend on next 10M maxsize 10G
extent management local 
AUTOALLOCATE BLOCKSIZE 8K SEGMENT SPACE MANAGEMENT AUTO;


-- USR_SREM
create user USR_SREM
identified by USR_SREM
default tablespace DAT_SREM 
quota unlimited on DAT_SREM;

grant connect, resource to USR_SREM;