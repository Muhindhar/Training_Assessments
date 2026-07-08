import fs from 'fs'
import path from 'path'
import {parse} from 'csv-parse/sync'
import { expect } from '@playwright/test';

export interface regdet{
    fname:string;
    lname:string,
    email:string,
    phone:string,
    password:string,
    conpassword:string,
};

export function csvreader():regdet[]{
    const filepath = path.resolve(__dirname,'../datafile/register.csv');
    const formatfile = fs.readFileSync(filepath,'utf-8');
    return parse(formatfile,{
        columns:true,
        skip_empty_lines:true,
        trim:true,
    }) as regdet[];
}
export{expect}