#!/bin/sh


logfile=$1
keyword=$2
numstep=$3
looknum=$4

if [ $# -ne 4 ]
then
		echo "格式错误，正确格式(test.sh logfile keyword numstep looknum) ! "
		exit
fi
function look()
{
			local up=0
			local LOCAL_N=$1
			local LOCAL_D=$2
			local LOCAL_N_SUB_1=$(($LOCAL_N - 1))
			if [ $LOCAL_N -eq 0 ]
			then
					#echo "轻松搞定"
					return 0
			else
					numstep=`expr ${numstep}`
					num=`grep -n "${keyword}" ${LOCAL_D}|tail -1|awk -F ":" '{print $1}'`
					if [[ -z ${num} ]]
					then
							echo "文件中没有关键字 '${keyword}'"
							exit
					fi
					num=`expr ${num}`
					if [ ${num} -le ${numstep} ]
					then
							startnum=1
					else
							startnum=`expr ${num} - ${numstep}`
					fi
					endnum=`expr ${num} + ${numstep}`
					cat ${LOCAL_D} | sed -n "${startnum},${endnum}"p > /test/tmp.log

					num=`grep -n "${keyword}" /test/tmp.log|tail -1|awk -F ":" '{print $1}'`
					num=`expr ${num}`


					test1=`sed -n "1,${num}"p /test/tmp.log |  grep '######'`
					if  [ "$?" -eq "0" ]
					then
							start_finalnum=`sed -n "1,${num}"p /test/tmp.log | grep -n '######' | tail -1 | awk -F ":" '{print $1}'`
							aaa=`sed -n "1,${num}"p /test/tmp.log | grep -n '######' | tail -1 | awk -F":" '{print $1}'`
							up=1
					else
							start_finalnum=1
					fi

					test=`sed -n "${num},${endnum}"p /test/tmp.log |  grep '######' `
					if [ "$?" -eq "0" ]
					then
							end_finalnum=`sed -n "${num},${endnum}"p /test/tmp.log | grep -n '######' | head -1 | awk -F ":" '{print $1}'`
					else
							end_finalnum=`cat /test/tmp.log|wc -l`
					fi
					end_finalnum=`expr ${num} + ${end_finalnum} - 1`


					#切出来log
					if [ $up -eq 0 ]
					then
							marknum=${startnum}
					else
							marknum_tmp=`expr ${startnum} + ${aaa}`
							marknum=`expr ${marknum_tmp} - 1`
					fi


					cat ${LOCAL_D} | sed -n "1,${marknum}"p > /test/datou_tmp.log
					cp -rf datou_tmp.log datou.log
					look $LOCAL_N_SUB_1 datou.log
			fi

}



look $looknum $logfile




sed -n "${start_finalnum},${end_finalnum}"p /test/tmp.log



#echo"${start_finalnum}----${end_finalnum}-----${end_finalnum}"
#rm tmp.log
#rm datou.log

